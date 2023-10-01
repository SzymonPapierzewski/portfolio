package com.szp.portfolio.ui.calculator

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.szp.portfolio.ui.calculator.widget.Calculator
import com.szp.portfolio.ui.theme.PortfolioTheme

@RootNavGraph
@Destination
@Composable
fun CalculatorScreen(
    navigator: DestinationsNavigator
) {
    PortfolioTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Black
        ) {
            Calculator()
        }
    }
}