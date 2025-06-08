package pwr.soszynski.mateusz.tft

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager.widget.PagerAdapter
import coil3.load
import pwr.soszynski.mateusz.tft.databinding.ActivityBigPhotoBinding

class BigPhotoActivity : AppCompatActivity() {


    inner class ImageAdapter(val imagesPathsList: List<String>) : PagerAdapter() {

        override fun isViewFromObject(p0: View, p1: Any): Boolean {
            return p0 == p1
        }

        override fun getCount(): Int {
            return imagesPathsList.count()
        }

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val imageView = ImageView(this@BigPhotoActivity)
            imageView.layoutParams =
                ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
            imageView.load(imagesPathsList[position])

            container.addView(imageView)

            return imageView
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            container.removeView(`object` as View)
        }
    }

    private lateinit var binding: ActivityBigPhotoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBigPhotoBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar!!.apply {
            setDisplayHomeAsUpEnabled(true)
            title = ""
        }


        val memesPathsArray = intent.getStringArrayExtra(IMAGES_SRC_PATH_ARRAY)!!.toList()

        val imageAdapter = ImageAdapter(memesPathsArray)
        binding.viewPager.adapter = imageAdapter
        binding.viewPager.currentItem = intent.getIntExtra(START_IMAGE_INDEX, 0)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }


    companion object {
        //        const val TAG = "BigImageActivity"
        const val START_IMAGE_INDEX = "param.start_image_index"
        const val IMAGES_SRC_PATH_ARRAY = "param.images_src_path_array"
    }
}