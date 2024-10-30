package br.com.thiagoodev.criptoio.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.thiagoodev.criptoio.domain.models.Crypto
import br.com.thiagoodev.criptoio.domain.usecases.GetAllCryptoUseCase
import br.com.thiagoodev.criptoio.ui.states.CryptoState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CryptoViewModel(private val getAllCryptoUseCase: GetAllCryptoUseCase) : ViewModel() {
    private val _uiState: MutableStateFlow<CryptoState> = MutableStateFlow(CryptoState.Initial)
    val uiState: StateFlow<CryptoState> = _uiState

    fun getAll() {
        _uiState.value = CryptoState.Loading
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response: List<Crypto> = getAllCryptoUseCase.call()
                emit(CryptoState.Success(response))
            } catch(exception: Exception) {
                emit(CryptoState.Error(exception))
            }
        }
    }

    private suspend fun emit(state: CryptoState) {
        withContext(Dispatchers.Main) { _uiState.value = state }
    }
}