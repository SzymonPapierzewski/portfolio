package com.szp.portfolio.ui.main.widget

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.szp.portfolio.ui.theme.PortfolioTheme

@Composable
fun FeatureButton(
    modifier: Modifier = Modifier,
    label: String,
    onClick: () -> Unit,
) {
    Button(
        modifier = modifier,
        onClick = onClick
    ) {
        Text(text = label)
    }
}

@Preview
@Composable
fun FeatureButtonPrev() {
    PortfolioTheme {
        FeatureButton(
            label = "Feature",
            onClick = { }
        )
    }
}