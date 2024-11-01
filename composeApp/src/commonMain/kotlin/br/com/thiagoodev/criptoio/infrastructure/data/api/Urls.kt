package br.com.thiagoodev.criptoio.infrastructure.data.api

object CoinMarketCapUrls {
    const val BASE_URL = "pro-api.coinmarketcap.com"
    private const val VERSION = "v1"

    const val LISTING_LATEST = "/$VERSION/cryptocurrency/listings/latest"
}