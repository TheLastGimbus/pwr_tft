package pwr.soszynski.mateusz.tft.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import coil3.load
import kotlinx.coroutines.*
import org.jsoup.Jsoup
import pwr.soszynski.mateusz.tft.R
import pwr.soszynski.mateusz.tft.databinding.FragmentAktualnosciBinding
import pwr.soszynski.mateusz.tft.databinding.NewsThumbnailBinding
import java.net.HttpURLConnection
import java.net.URL
import java.time.LocalDate
import java.time.format.DateTimeFormatter


class AktualnosciFragment : Fragment() {

    data class NewsData(
        val title: String,
        val link: String,
        val date: LocalDate,
        val imgSrc: String,
    )

    private var _binding: FragmentAktualnosciBinding? = null

    val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        throwable.printStackTrace()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAktualnosciBinding.inflate(inflater, container, false)
        val root = _binding!!.root

        var allNews = mutableListOf<NewsData>()



        GlobalScope.launch(Dispatchers.Main + coroutineExceptionHandler) {
            async(Dispatchers.IO + coroutineExceptionHandler) {
                val news = getNews()
                Log.d("NEWS", news.toString())
                withContext(Dispatchers.Main + coroutineExceptionHandler) {
                    for (n in news) {
                        val th = inflater.inflate(R.layout.news_thumbnail, _binding!!.newsList, false)
                        val thBind = NewsThumbnailBinding.bind(th)
                        thBind.thumbnailImage.load(n.imgSrc)
                        thBind.date.text = n.date.toString()
                        thBind.title.text = n.title
                        thBind.buttonOpen.setOnClickListener { openWebsite(requireContext(), n.link) }
                        _binding!!.newsList.addView(th)
                    }


                }
            }
        }

        return root
    }


    fun getNews(): List<NewsData> {
        val allNews = mutableListOf<NewsData>()
        val soup = Jsoup.connect("https://tft.pwr.edu.pl/strona-glowna/aktualnosci").get()
        for (newsDiv in soup.select(".news-box")) {
            val titleLink = newsDiv.select(".title").first()!!
            allNews.add(
                NewsData(
                    title = titleLink.attr("title"),
                    link = "https://tft.pwr.edu.pl" + titleLink.attr("href"),
                    date = LocalDate.parse(
                        newsDiv.select(".date").first()?.text()?.substring(6) ?: "01.01.1970",
                        DateTimeFormatter.ofPattern("dd.MM.yyyy")
                    ),
                    imgSrc = "https://tft.pwr.edu.pl" + newsDiv.select("img").first()!!.attr("src"),
                )
            )
        }
        return allNews
    }

    fun downloadAktualnosci(): String {
        val url: URL = URL("https://tft.pwr.edu.pl/strona-glowna/aktualnosci")
        val urlConnection = url.openConnection() as HttpURLConnection
        return urlConnection.content.toString();
    }
}