package pwr.soszynski.mateusz.tft.ui.contact

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import org.maplibre.android.MapLibre
import org.maplibre.android.camera.CameraPosition
import org.maplibre.android.geometry.LatLng
import org.maplibre.android.plugins.annotation.SymbolManager
import org.maplibre.android.plugins.annotation.SymbolOptions
import org.maplibre.android.style.layers.Property
import org.maplibre.android.utils.BitmapUtils
import pwr.soszynski.mateusz.tft.R
import pwr.soszynski.mateusz.tft.databinding.FragmentContactBinding

class ContactFragment : Fragment() {

    private var _binding: FragmentContactBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Init MapLibre
        MapLibre.getInstance(requireActivity())

        _binding = FragmentContactBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val latLngC2 = LatLng(51.108940, 17.060984)
        val mapView = binding.mapView
        mapView.getMapAsync { map ->
            map.setStyle("https://api.maptiler.com/maps/streets-v2/style.json?key=aIuuUSuCwK4zMjlq0rYK") { style ->
                val ID_ICON_TAG = "id_icon_tag"
                style.addImage(
                    ID_ICON_TAG,
                    BitmapUtils.getBitmapFromDrawable(getResources().getDrawable(R.drawable.red_marker))!!,
                    false
                );

                val sm = SymbolManager(mapView, map, style)
                sm.create(
                    SymbolOptions()
                        .withIconImage(ID_ICON_TAG)
                        .withIconSize(0.7f)
                        .withLatLng(latLngC2)
                        .withIconAnchor(Property.ICON_ANCHOR_BOTTOM)
                )
            }
            map.cameraPosition = CameraPosition.Builder().target(latLngC2).zoom(13.5).build()

        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}