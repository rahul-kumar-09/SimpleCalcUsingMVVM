package com.programmingz.calcusingmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.programmingz.calcusingmvvm.model.CalculatorData

class CalculatorViewModel: ViewModel() {
    fun calculateSum(num1: Int, num2: Int) : CalculatorData{

        val sum = num1 + num2
        return CalculatorData(num1, num2, sum)
    }
    fun calculateSub(num1: Int, num2: Int) : CalculatorData{

        val sum = num1 - num2
        return CalculatorData(num1, num2, sum)
    }
    fun calculateMul(num1: Int, num2: Int) : CalculatorData{

        val sum = num1 * num2
        return CalculatorData(num1, num2, sum)
    }
    fun calculateDiv(num1: Int, num2: Int) : CalculatorData{

        val sum = num1 / num2
        return CalculatorData(num1, num2, sum)
    }

}