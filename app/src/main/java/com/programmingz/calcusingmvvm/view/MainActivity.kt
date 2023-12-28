package com.programmingz.calcusingmvvm.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.programmingz.calcusingmvvm.R
import com.programmingz.calcusingmvvm.databinding.ActivityMainBinding
import com.programmingz.calcusingmvvm.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var calculatorViewModel: CalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculatorViewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        binding.addButton.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.etNum2.text.toString().toIntOrNull() ?: 0
            val result = calculatorViewModel.calculateSum(num1, num2)
            binding.txtResult.text = "${result.sum}"
        }


        binding.subButton.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.etNum2.text.toString().toIntOrNull() ?: 0
            val result = calculatorViewModel.calculateSub(num1, num2)
            binding.txtResult.text = "${result.sum}"
        }


        binding.mulButton.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.etNum2.text.toString().toIntOrNull() ?: 0
            val result = calculatorViewModel.calculateMul(num1, num2)
            binding.txtResult.text = "${result.sum}"
        }


        binding.divButton.setOnClickListener {
            val num1 = binding.etNum1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.etNum2.text.toString().toIntOrNull() ?: 0
            val result = calculatorViewModel.calculateDiv(num1, num2)
            binding.txtResult.text = "${result.sum}"
        }


    }
}