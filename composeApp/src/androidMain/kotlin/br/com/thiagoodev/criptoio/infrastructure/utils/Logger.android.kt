package br.com.thiagoodev.criptoio.infrastructure.utils

import android.util.Log

actual class LoggerPlatform {
    actual companion object {
        actual fun log(tag: String, message: String) {
            Log.i(tag, message)
        }
    }
}