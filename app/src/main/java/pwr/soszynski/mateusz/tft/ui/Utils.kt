package pwr.soszynski.mateusz.tft.ui

import android.content.Context
import android.content.Intent
import android.util.DisplayMetrics
import androidx.core.net.toUri
import kotlinx.coroutines.CoroutineExceptionHandler
import pwr.soszynski.mateusz.tft.R

val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
    throwable.printStackTrace()
}

fun Int.toPx(context: Context) = this * context.resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT

fun openWebsite(ctx: Context, url: String) = ctx.startActivity(Intent(Intent.ACTION_VIEW, url.toUri()))

fun nameToPhoto(name: String): Int? {
    for (name in name.lowercase().split(" ")) {
        val found = when (name) {
            "obstarczyk" -> R.drawable.agata_obstarczyk
            "wiatrowski" -> R.drawable.artur_wiatrowski
            "wojcieszak" -> R.drawable.damian_wojcieszak
            "domaradzki" -> R.drawable.jaroslaw_domaradzki
            "bartczak" -> R.drawable.mateusz_bartczak
            "mazur" -> R.drawable.michal_mazur
            "kiliszkiewicz" -> R.drawable.milena_kiliszkiewicz
            "pokryszka" -> R.drawable.piotr_pokryszka
            "paszkiewicz" -> R.drawable.regina_paszkiewicz
            "krysztof" -> R.drawable.michal_krysztof
            else -> null
        }
        if (found != null) return found
    }
    return null
}