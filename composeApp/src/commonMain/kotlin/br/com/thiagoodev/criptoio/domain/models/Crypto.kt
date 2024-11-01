package br.com.thiagoodev.criptoio.domain.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Crypto(
    val id: Int,
    val name: String,
    val symbol: String,
    val slug: String,
    @SerialName("cmc_rank")
    val cmcRank: Int?,
    @SerialName("num_market_pairs")
    val numMarketPairs: Int?,
    @SerialName("circulating_supply")
    val circulatingSupply: Double?,
    @SerialName("total_supply")
    val totalSupply: Double?,
    @SerialName("max_supply")
    val maxSupply: Double?,
    @SerialName("infinite_supply")
    val infiniteSupply: Boolean,
    @SerialName("last_updated")
    val lastUpdated: String,
    @SerialName("date_added")
    val dateAdded: String,
    val tags: List<String>?,
    val platform: Platform?,
    @SerialName("self_reported_circulating_supply")
    val selfReportedCirculatingSupply: Double?,
    @SerialName("self_reported_market_cap")
    val selfReportedMarketCap: Double?,
    val quote: Quote,
)