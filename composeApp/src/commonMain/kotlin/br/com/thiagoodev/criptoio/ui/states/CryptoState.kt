package br.com.thiagoodev.criptoio.ui.states

import br.com.thiagoodev.criptoio.domain.models.Crypto

abstract class CryptoState {
    object Initial : CryptoState()
    object Loading : CryptoState()
    data class Success(val cryptos: List<Crypto>) : CryptoState()
    data class Error(val error: Exception) : CryptoState()
}
