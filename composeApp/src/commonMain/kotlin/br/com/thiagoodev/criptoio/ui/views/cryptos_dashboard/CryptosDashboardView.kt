package br.com.thiagoodev.criptoio.ui.views.cryptos_dashboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import br.com.thiagoodev.criptoio.domain.models.Crypto
import br.com.thiagoodev.criptoio.ui.states.CryptoState
import br.com.thiagoodev.criptoio.ui.viewmodels.CryptoViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun CryptosDashboardView(viewModel: CryptoViewModel = koinViewModel()) {
    LaunchedEffect(Unit) {
        viewModel.getAll()
    }

    Surface {
        Scaffold { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                val uiState: State<CryptoState> = viewModel.uiState.collectAsState()
                val state: CryptoState = uiState.value

                if(state is CryptoState.Success) {
                    val cryptos: List<Crypto> = state.cryptos
                    Column {
                        cryptos.map { crypto ->
                            Text(crypto.name)
                        }
                    }
                }

                if(state is CryptoState.Error) {
                    val error: Exception = state.error
                    Text(error.message ?: "")
                }
            }
        }
    }

}