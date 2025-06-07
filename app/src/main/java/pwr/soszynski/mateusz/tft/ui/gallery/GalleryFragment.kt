package pwr.soszynski.mateusz.tft.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.Dimension
import androidx.core.view.updateLayoutParams
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import coil3.load
import kotlinx.coroutines.*
import org.jsoup.Jsoup
import pwr.soszynski.mateusz.tft.databinding.FragmentGalleryBinding
import pwr.soszynski.mateusz.tft.ui.coroutineExceptionHandler
import pwr.soszynski.mateusz.tft.ui.toPx

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root


        GlobalScope.launch(Dispatchers.Main + coroutineExceptionHandler) {
            async(Dispatchers.IO + coroutineExceptionHandler) {
                val photos = getPhotos()
                withContext(Dispatchers.Main + coroutineExceptionHandler) {
                    for (photo in photos) {

                        val img = ImageView(requireContext())

//                        img.updateLayoutParams {
//                            width = 64.toPx(requireContext())
//                            height = 64.toPx(requireContext())
//                        }
                        img.load(photo)
                        _binding!!.flexGallery.addView(img)
                    }

                }
            }
        }

        return root
    }

    fun getPhotos(): List<String> {
        val soup = Jsoup.connect("https://tft.pwr.edu.pl/strona-glowna/galeria/").get()
        return soup.select("#module-description-content img").map { img -> "https://tft.pwr.edu.pl" + img.attr("src") }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}