package com.szp.portfolio.ui.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.navigation.EmptyDestinationsNavigator
import com.szp.portfolio.ui.destinations.CalculatorScreenDestination
import com.szp.portfolio.ui.main.widget.FeatureButton
import com.szp.portfolio.ui.main.widget.MainScreenToolbar
import com.szp.portfolio.ui.theme.PortfolioTheme
import com.szp.portfolio.ui.widget.Screen

@RootNavGraph(start = true)
@Destination
@Composable
fun MainScreen(
    navigator: DestinationsNavigator,
    modifier: Modifier = Modifier,
) {
    Screen(modifier = modifier) {
        Column {
            MainScreenToolbar()
            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 16.dp)
            ) {
                item {
                    FeatureButton(
                        label = "Calculator",
                        onClick = { navigator.navigate(CalculatorScreenDestination) }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPrev() {
    PortfolioTheme {
        MainScreen(navigator = EmptyDestinationsNavigator)
    }
}