package br.com.thiagoodev.criptoio.di

import br.com.thiagoodev.criptoio.domain.data.repositories.CryptoRepository
import br.com.thiagoodev.criptoio.infrastructure.data.datasources.CryptoRemoteDataSource
import br.com.thiagoodev.criptoio.infrastructure.data.repositories.CryptoRepositoryImp
import br.com.thiagoodev.criptoio.domain.usecases.GetLatestCryptoUseCase
import br.com.thiagoodev.criptoio.ui.viewmodels.CryptoViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

val cryptoModule: Module = module {
    factoryOf(::CryptoRemoteDataSource)
    factoryOf(::CryptoRepositoryImp) bind CryptoRepository::class
    factoryOf(::GetLatestCryptoUseCase)
    viewModelOf(::CryptoViewModel)
}