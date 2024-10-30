package br.com.thiagoodev.criptoio.domain.data.repositories

import br.com.thiagoodev.criptoio.domain.data_values.CryptoApiResponse

interface CryptoRepository {
    suspend fun all(): CryptoApiResponse
}