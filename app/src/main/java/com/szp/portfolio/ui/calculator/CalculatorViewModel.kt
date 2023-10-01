package com.szp.portfolio.ui.calculator

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.szp.portfolio.ui.calculator.model.CalculatorOperation
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CalculatorViewModel : ViewModel() {

    private val _result = MutableStateFlow(0.0)
    val result get() = _result.asStateFlow()

    private var _currentOperation: CalculatorOperation? = null
    private var _currentValue = ""

    fun clear() = viewModelScope.launch { _result.emit(0.0) }
    fun changeSign() = viewModelScope.launch {
        if(_result.value != 0.0) {
            _result.emit(_result.value * -1)
        }
    }
    fun operation(operation: CalculatorOperation) { _currentOperation = operation }
    fun append(number: Int) {
        _currentValue += number.toString()
        viewModelScope.launch {
            _result.emit(_currentValue.toDoubleOrNull() ?: 0.0)
        }
    }
    fun append(number: String) {
        _currentValue += number
        viewModelScope.launch {
            _result.emit(_currentValue.toDoubleOrNull() ?: 0.0)
        }
    }

    fun count() {

    }
}