package br.com.thiagoodev.criptoio.infrastructure.utils

expect class LoggerPlatform {
    companion object {
        fun log(tag: String, message: String)
    }
}
