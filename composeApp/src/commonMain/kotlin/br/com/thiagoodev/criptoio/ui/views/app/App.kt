package br.com.thiagoodev.criptoio.ui.views.app

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import br.com.thiagoodev.criptoio.di.cryptoModule
import br.com.thiagoodev.criptoio.di.httpModule
import br.com.thiagoodev.criptoio.ui.views.navigation.NavigationView
import org.jetbrains.compose.ui.tooling.preview.Preview

import org.koin.compose.KoinApplication

@Composable
@Preview
fun App() {
    KoinApplication({
        modules(
            httpModule,
            cryptoModule,
        )
    }) {
        MaterialTheme { NavigationView() }
    }
}