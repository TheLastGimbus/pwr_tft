package pwr.soszynski.mateusz.tft

import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import io.noties.markwon.Markwon
import io.noties.markwon.image.ImagesPlugin
import io.noties.markwon.image.destination.ImageDestinationProcessorAssets
import io.noties.markwon.image.file.FileSchemeHandler
import pwr.soszynski.mateusz.tft.databinding.ActivityAboutBinding


class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityAboutBinding.inflate(layoutInflater)
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

        val markwon = Markwon.builder(this).usePlugin(ImagesPlugin.create { plugin ->
            plugin.addSchemeHandler(
                FileSchemeHandler.createWithAssets(this@AboutActivity)
            )
        }).build()
        markwon.setMarkdown(
            binding.textViewMarkdown, """
            # ℹ️ O aplikacji
            
            Mateusz Soszyński, 282935
            
             ![Ja](file:///android_asset/ja_small.jpg)
            
            Aplikacja ta jest repliką strony [tft.pwr.edu.pl](https://tft.pwr.edu.pl/) - ale ma ona pare wyjątkowych funkcji 🤫
             
            Stworzona na zajęcia z Androida u Pani Dr Mileny Kiliszkiewicz, w 2025 roku 🌈
             
             ## 📚 Użyte biblioteki i technologie
             - 📱 Całe UI jest w klasycznym Androidowym XML
             - 📰 Aktualności oraz galeria są pobierane ze strony TFT poprzez web scraping
             - 🖼️ [Coil](https://github.com/coil-kt/coil) - do ładowania zdjęć
             - 🍲 [JSoup](https://jsoup.org/) - do web scrape'ingu
             - 🗾 [MapLibre](https://maplibre.org/) - do mapki
             - ↔️ [Google FlexBox](https://github.com/google/flexbox-layout) - LinearLayout który zawija się
             - ⬇️ [Markwon](https://github.com/noties/Markwon) - do tej właśnie strony 😅
             
             
             ## 🔗 Przydatne linki
             - GitHub aplikacji: [github.com/TheLastGimbus/pwr_tft](https://github.com/TheLastGimbus/pwr_tft)
             - Mój GitHub: [github.com/TheLastGimbus](https://github.com/TheLastGimbus)
             - Moja strona: [the.lastgimbus.com/](https://the.lastgimbus.com/)
             
             
             ---
        """.trimIndent()
        )
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}