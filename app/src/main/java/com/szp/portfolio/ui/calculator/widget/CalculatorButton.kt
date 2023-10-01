package com.szp.portfolio.ui.calculator.widget

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.szp.portfolio.ui.theme.PortfolioTheme

@Composable
fun CalculatorButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        contentPadding = PaddingValues(0.dp),
        shape = CircleShape
    ) {
        content()
    }
}

@Preview
@Composable
fun CalculatorButtonPrev() {
    PortfolioTheme {
        CalculatorButton(onClick = {}) {
            Text(text = "1")
        }
    }
}