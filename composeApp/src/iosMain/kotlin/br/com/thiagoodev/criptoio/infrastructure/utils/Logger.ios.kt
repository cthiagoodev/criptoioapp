package br.com.thiagoodev.criptoio.infrastructure.utils

import platform.Foundation.NSLog

actual class LoggerPlatform {
    actual companion object {
        actual fun log(tag: String, message: String) {
            NSLog("[$tag] - $message")
        }
    }
}
