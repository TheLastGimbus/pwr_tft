package pwr.soszynski.mateusz.tft.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import coil3.load
import kotlinx.coroutines.*
import org.jsoup.Jsoup
import pwr.soszynski.mateusz.tft.BigPhotoActivity
import pwr.soszynski.mateusz.tft.databinding.FragmentGalleryBinding
import pwr.soszynski.mateusz.tft.ui.coroutineExceptionHandler
import java.time.LocalDate
import kotlin.random.Random

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val galleryViewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root


        GlobalScope.launch(Dispatchers.Main + coroutineExceptionHandler) {
            async(Dispatchers.IO + coroutineExceptionHandler) {
                val photos = getPhotos()
                withContext(Dispatchers.Main + coroutineExceptionHandler) {
                    val randomPhoto  = photos.random(Random(LocalDate.now().dayOfMonth))
                    _binding!!.zdjecieDnia.load(randomPhoto.second)
                    _binding!!.zdjecieDnia.setOnClickListener {
                        startActivity(Intent(requireContext(), BigPhotoActivity::class.java).apply {
                            putExtra(
                                BigPhotoActivity.IMAGES_SRC_PATH_ARRAY,
                                photos.map { it.second }.toTypedArray()
                            )
                            putExtra(BigPhotoActivity.START_IMAGE_INDEX, photos.indexOf(randomPhoto))
                        })
                    }

                    for (photo in photos) {
                        val img = ImageView(requireContext())
                        img.load(photo.first)
                        img.setOnClickListener {
                            startActivity(Intent(requireContext(), BigPhotoActivity::class.java).apply {
                                putExtra(
                                    BigPhotoActivity.IMAGES_SRC_PATH_ARRAY,
                                    photos.map { it.second }.toTypedArray()
                                )
                                putExtra(BigPhotoActivity.START_IMAGE_INDEX, photos.indexOf(photo))
                            })
                        }
                        _binding!!.flexGallery.addView(img)
                    }

                }
            }
        }

        return root
    }

    fun getPhotos(): List<Pair<String, String>> {
        val soup = Jsoup.connect("https://tft.pwr.edu.pl/strona-glowna/galeria/").get()
        return soup.select(".photo").map { link ->
            Pair(
                "https://tft.pwr.edu.pl" + link.select("img").first()!!.attr("src"),
                "https://tft.pwr.edu.pl" + link.select("a").first()!!.attr("href")
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}