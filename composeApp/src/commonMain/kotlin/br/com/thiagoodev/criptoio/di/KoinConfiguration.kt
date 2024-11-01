package br.com.thiagoodev.criptoio.di

import org.koin.core.KoinApplication
import org.koin.dsl.koinApplication

fun koinConfiguration(): KoinApplication = koinApplication {
    modules(
        httpModule,
        cryptoModule,
    )
}