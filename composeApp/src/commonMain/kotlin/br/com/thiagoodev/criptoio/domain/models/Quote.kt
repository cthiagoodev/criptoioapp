package br.com.thiagoodev.criptoio.domain.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Quote(
    @SerialName("BRL")
    val brl: CurrencyCoinData,
)
