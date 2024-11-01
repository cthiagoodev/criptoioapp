package br.com.thiagoodev.criptoio.infrastructure.services.http

import br.com.thiagoodev.criptoio.infrastructure.data.api.CoinMarketCapUrls
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.HttpSend
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.plugin
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.headers
import io.ktor.http.URLProtocol
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

fun getHttpClient(): HttpClient {
    val client = configClient()

    configTokenInterceptor(client)

    return client
}

private fun configClient(): HttpClient {
    val baseUrl: String = CoinMarketCapUrls.BASE_URL
    return HttpClient(CIO) {
        install(Logging)
        install(ContentNegotiation) {
            json(Json { ignoreUnknownKeys = true })
        }

        expectSuccess = true

        defaultRequest {
            url {
                protocol = URLProtocol.HTTPS
                host = baseUrl
            }
        }
    }
}

private fun configTokenInterceptor(client: HttpClient) {
    client
        .plugin(HttpSend)
        .intercept { request ->
            if(!request.headers.contains("Authorization")) {
                val newRequest: HttpRequestBuilder = request.apply {
                    headers {
                        append("X-CMC_PRO_API_KEY", "fa7ad1d2-1bd6-44c0-ab90-20552e75e8bf")
                    }
                }

                execute(newRequest)
            }

            execute(request)
        }
}
