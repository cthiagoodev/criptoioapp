package br.com.thiagoodev.criptoio.domain.data_values

import br.com.thiagoodev.criptoio.domain.models.Crypto

data class CryptoApiResponse(
    val data: List<Crypto>,
    val status: Status,
)
