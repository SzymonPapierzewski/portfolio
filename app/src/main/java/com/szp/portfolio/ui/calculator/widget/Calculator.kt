package com.szp.portfolio.ui.calculator.widget

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.szp.portfolio.ui.calculator.CalculatorViewModel
import com.szp.portfolio.ui.calculator.model.CalculatorOperation

@Composable
fun Calculator(
    modifier: Modifier = Modifier
) {
    val viewModel: CalculatorViewModel = viewModel()
    val result by viewModel.result.collectAsState()

    Column(
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Text(
                text = result.toString(),
                color = Color.White,
                textAlign = TextAlign.End,
                fontSize = 32.sp,
                modifier = Modifier
                    .padding(16.dp)
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Button(
                onClick = { viewModel.clear() },
                shape = CircleShape,
                contentPadding = PaddingValues(0.dp),
            ) {
                Text(text = "C")
            }
            Button(onClick = { viewModel.changeSign() }) {
                Text(text = "+/-")
            }
            Button(onClick = { viewModel.operation(CalculatorOperation.PERCENT) }) {
                Text(text = "%")
            }
            Button(onClick = { viewModel.operation(CalculatorOperation.DIVIDE) }) {
                Text(text = "/")
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Button(onClick = { viewModel.append(7) }) {
                Text(text = "7")
            }
            Button(onClick = { viewModel.append(8) }) {
                Text(text = "8")
            }
            Button(onClick = { viewModel.append(9) }) {
                Text(text = "9")
            }
            Button(onClick = { viewModel.operation(CalculatorOperation.TIMES) }) {
                Text(text = "x")
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Button(onClick = { viewModel.append(4) }) {
                Text(text = "4")
            }
            Button(onClick = { viewModel.append(5) }) {
                Text(text = "5")
            }
            Button(onClick = { viewModel.append(6) }) {
                Text(text = "6")
            }
            Button(onClick = { viewModel.operation(CalculatorOperation.MINUS) }) {
                Text(text = "-")
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Button(onClick = { viewModel.append(1) }) {
                Text(text = "1")
            }
            Button(onClick = { viewModel.append(2) }) {
                Text(text = "2")
            }
            Button(onClick = { viewModel.append(3) }) {
                Text(text = "3")
            }
            Button(
                onClick = { viewModel.operation(CalculatorOperation.PLUS) },
                shape = CircleShape
            ) {
                Text(text = "+")
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Button(onClick = { viewModel.append(0) }) {
                Text(text = "0")
            }
            Button(onClick = { viewModel.append(".") }) {
                Text(text = ".")
            }
            Button(onClick = { viewModel.count() }) {
                Text(text = "=")
            }
        }
    }
}

@Preview
@Composable
fun CalculatorPrev() {
    Calculator()
}