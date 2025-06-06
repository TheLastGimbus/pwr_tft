package pwr.soszynski.mateusz.tft

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import pwr.soszynski.mateusz.tft.databinding.ActivityMainBinding
import pwr.soszynski.mateusz.tft.ui.openWebsite


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

        binding.appBarMain.fab.setOnClickListener { _ ->
            openWebsite(
                this,
                "mailto:milena.kiliszkiewicz@pwr.edu.pl?body=https://github.com/TheLastGimbus/pwr_tft"
            )
        }
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_aktualnosci, R.id.nav_home, R.id.nav_publikacje, R.id.nav_gallery, R.id.nav_contact
            ), drawerLayout
        )
        navController.addOnDestinationChangedListener { ctrl, dest, bundle ->
            when (dest.id) {
                R.id.nav_contact -> {
                    binding.appBarMain.fab.setImageResource(R.drawable.baseline_assistant_navigation_24)
                    binding.appBarMain.fab.setOnClickListener { _ ->
                        openWebsite(
                            this,
                            "https://www.google.com/maps/dir/?api=1&destination=C2+Politechnika+Wrocławska&destination_place_id=ChIJPZWzq7fpD0cRAv07QDSCEoI"
                        )
                    }
                }

                else -> {
                    binding.appBarMain.fab.setImageResource(R.drawable.outline_alternate_email_24)
                    binding.appBarMain.fab.setOnClickListener { _ ->
                        openWebsite(
                            this,
                            "mailto:milena.kiliszkiewicz@pwr.edu.pl?body=https://github.com/TheLastGimbus/pwr_tft"
                        )
                    }
                }
            }
        }
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}