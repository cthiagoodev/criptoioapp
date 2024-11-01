package br.com.thiagoodev.criptoio.ui.views.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.thiagoodev.criptoio.ui.Routes
import br.com.thiagoodev.criptoio.ui.views.cryptos_dashboard.CryptosDashboardView

@Composable
fun NavigationView() {
    val navHostController = rememberNavController()

    NavHost(
        navHostController,
        startDestination = Routes.CRYPTO_DASHBOARD,
    ) {
        composable(Routes.CRYPTO_DASHBOARD) { CryptosDashboardView() }
    }
}