package br.com.thiagoodev.criptoio.domain.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Platform(
    val id: Int,
    val name: String,
    val symbol: String,
    val slug: String,
    @SerialName("token_address")
    val tokenAddress: String
)
