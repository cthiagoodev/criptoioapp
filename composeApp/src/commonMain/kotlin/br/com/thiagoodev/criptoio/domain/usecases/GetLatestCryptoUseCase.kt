package br.com.thiagoodev.criptoio.domain.usecases

import br.com.thiagoodev.criptoio.domain.data.repositories.CryptoRepository
import br.com.thiagoodev.criptoio.domain.data_values.CryptoApiResponse
import br.com.thiagoodev.criptoio.domain.models.Crypto

class GetLatestCryptoUseCase(private val repository: CryptoRepository) {
    suspend fun call(): List<Crypto> {
        val response: CryptoApiResponse = repository.latest()
        return response.data
    }
}