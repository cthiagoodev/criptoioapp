package br.com.thiagoodev.criptoio.di

import br.com.thiagoodev.criptoio.infrastructure.services.http.getHttpClient
import org.koin.core.module.Module
import org.koin.dsl.module

val httpModule: Module = module {
    single { getHttpClient() }
}