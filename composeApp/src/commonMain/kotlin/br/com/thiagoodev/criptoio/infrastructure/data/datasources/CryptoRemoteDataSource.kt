package br.com.thiagoodev.criptoio.infrastructure.data.datasources

import br.com.thiagoodev.criptoio.infrastructure.data.api.CoinMarketCapUrls
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse

class CryptoRemoteDataSource(private val client: HttpClient) {
    suspend fun listingLatest(coinConvert: String = "BRL"): HttpResponse {
        val url = "${CoinMarketCapUrls.LISTING_LATEST}?convert=$coinConvert"
        return client.get(url)
    }
}