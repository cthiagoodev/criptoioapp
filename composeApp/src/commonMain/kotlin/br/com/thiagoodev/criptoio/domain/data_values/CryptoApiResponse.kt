package br.com.thiagoodev.criptoio.domain.data_values

import br.com.thiagoodev.criptoio.domain.models.Crypto
import kotlinx.serialization.Serializable

@Serializable
data class CryptoApiResponse(
    val data: List<Crypto>,
    val status: Status,
)
