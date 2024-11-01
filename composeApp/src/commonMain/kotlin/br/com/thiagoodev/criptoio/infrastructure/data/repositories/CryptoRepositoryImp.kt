package br.com.thiagoodev.criptoio.infrastructure.data.repositories

import br.com.thiagoodev.criptoio.domain.data.repositories.CryptoRepository
import br.com.thiagoodev.criptoio.domain.data_values.CryptoApiResponse
import br.com.thiagoodev.criptoio.infrastructure.data.datasources.CryptoRemoteDataSource
import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse

class CryptoRepositoryImp(private val dataSource: CryptoRemoteDataSource) : CryptoRepository {
    override suspend fun latest(): CryptoApiResponse {
        val response: HttpResponse = dataSource.listingLatest()
        return response.body<CryptoApiResponse>()
    }
}