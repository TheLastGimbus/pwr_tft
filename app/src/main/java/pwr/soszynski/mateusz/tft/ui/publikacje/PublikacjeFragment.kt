package pwr.soszynski.mateusz.tft.ui.publikacje

import android.content.Context
import android.os.Bundle
import android.os.Vibrator
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pwr.soszynski.mateusz.tft.R
import pwr.soszynski.mateusz.tft.databinding.FragmentPublikacjeBinding
import pwr.soszynski.mateusz.tft.databinding.PersonBinding
import pwr.soszynski.mateusz.tft.databinding.PublikacjaHeaderBinding
import pwr.soszynski.mateusz.tft.ui.nameToPhoto
import pwr.soszynski.mateusz.tft.ui.openWebsite
import pwr.soszynski.mateusz.tft.ui.publikacje.ShakeListener.OnShakeListener


class PublikacjeFragment : Fragment() {
    private var mShaker: ShakeListener? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private var _binding: FragmentPublikacjeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        _binding = FragmentPublikacjeBinding.inflate(inflater, container, false)
        val root = _binding!!.root

        mShaker = ShakeListener(requireContext())
        mShaker!!.setOnShakeListener(object : OnShakeListener {
            override fun onShake() {
                Log.i("SHAKE", "SHAKE SHAKE SHAKE")
                if (!isAdded) return

                try {
                    val v = requireContext().getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                    v.vibrate(500)
                } catch (e: Exception) {
                    return
                }

                val pub = publikacje.random()

                val pubView = inflater.inflate(R.layout.publikacja_header, _binding!!.root, false)
                val pubBind = PublikacjaHeaderBinding.bind(pubView)
                pubBind.textViewTytulPublikacji.text = pub.title
                pubBind.textViewRokPublikacji.text = pub.year.toString()

                for (author in pub.authors) {
                    val authorView = inflater.inflate(R.layout.person, pubBind.autorzyList, false)
                    val authorBind = PersonBinding.bind(authorView)
                    authorBind.textViewName.text = author
                    val photoRes = nameToPhoto(author) ?: R.drawable.generic_avatar
                    authorBind.imageViewPhoto.setImageResource(photoRes)
                    pubBind.autorzyList.addView(authorView)
                }

                pubBind.buttonRead.setOnClickListener { openWebsite(requireContext(), pub.url) }

                _binding!!.framePublikacja.removeAllViews()
                _binding!!.framePublikacja.addView(pubView)

            }
        })
//        shakeListener.setOnShakeListener()

        // Inflate the layout for this fragment
        return root
    }

}
