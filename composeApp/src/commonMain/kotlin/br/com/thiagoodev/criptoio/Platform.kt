package br.com.thiagoodev.criptoio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform