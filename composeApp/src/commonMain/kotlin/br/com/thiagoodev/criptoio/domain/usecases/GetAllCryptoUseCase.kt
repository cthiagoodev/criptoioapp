package br.com.thiagoodev.criptoio.domain.usecases

import br.com.thiagoodev.criptoio.domain.data.repositories.CryptoRepository
import br.com.thiagoodev.criptoio.domain.data_values.CryptoApiResponse
import br.com.thiagoodev.criptoio.domain.models.Crypto

class GetAllCryptoUseCase(private val repository: CryptoRepository) {
    suspend fun call(): List<Crypto> {
        try {
            val response: CryptoApiResponse = repository.all()
            return response.data
        } catch(exception: Exception) {
            return emptyList()
        }
    }
}