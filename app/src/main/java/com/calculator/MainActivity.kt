package com.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var backSpaceButton: Button? = null
    private var clearButton: Button? = null
    private var plusMinusButton: Button? = null
    private var divisionButton: Button? = null
    private var nineButton: Button? = null
    private var eightButton: Button? = null
    private var sevenButton: Button? = null
    private var multiplyButton: Button? = null
    private var sixButton: Button? = null
    private var fiveButton: Button? = null
    private var fourButton: Button? = null
    private var oneButton: Button? = null
    private var twoButton: Button? = null
    private var threeButton: Button? = null
    private var minusButton: Button? = null
    private var zeroButton: Button? = null
    private var pointButton: Button? = null
    private var equalButton: Button? = null
    private var plusButton: Button? = null
    private var result: TextView? = null
    private var memory: Double = 0.0
    private var operation: String = ""
    private var operationFlag: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButtons()
        initOnClickListeners()
        result?.text = "0"
    }

    private fun initOnClickListeners() {
        zeroButton?.setOnClickListener({
            if (!operationFlag && !"0".equals(result?.text.toString())) {
                result?.text = result?.text.toString() + '0'
            } else {
                result?.text = "0"
                operationFlag = false
            }
        })

        oneButton?.setOnClickListener({
            if (!operationFlag) {
                if ("0" != result?.text.toString()) {
                    result?.text = result?.text.toString() + '1'
                } else {
                    result?.text = "1"
                }
            } else {
                result?.text = "1"
                operationFlag = false
            }
        })

        twoButton?.setOnClickListener({
            if (!operationFlag) {
                if ("0" != result?.text.toString()) {
                    result?.text = result?.text.toString() + '2'
                } else {
                    result?.text = 2.toString()
                }
            } else {
                result?.text = 2.toString()
                operationFlag = false
            }
        })

        threeButton?.setOnClickListener({
            if (!operationFlag) {
                if ("0" != result?.text.toString()) {
                    result?.text = result?.text.toString() + '3'
                } else {
                    result?.text = 3.toString()
                }
            } else {
                result?.text = 3.toString()
                operationFlag = false
            }
        })

        fourButton?.setOnClickListener({
            if (!operationFlag) {
                if ("0" != result?.text.toString()) {
                    result?.text = result?.text.toString() + '4'
                } else {
                    result?.text = 4.toString()
                }
            } else {
                result?.text = 4.toString()
                operationFlag = false
            }
        })

        fiveButton?.setOnClickListener({
            if (!operationFlag) {
                if ("0" != result?.text.toString()) {
                    result?.text = result?.text.toString() + '5'
                } else {
                    result?.text = 5.toString()
                }
            } else {
                result?.text = 5.toString()
                operationFlag = false
            }
        })

        sixButton?.setOnClickListener({
            if (!operationFlag) {
                if ("0" != result?.text.toString()) {
                    result?.text = result?.text.toString() + '6'
                } else {
                    result?.text = 6.toString()
                }
            } else {
                result?.text = 6.toString()
                operationFlag = false
            }
        })

        sevenButton?.setOnClickListener({
            if (!operationFlag) {
                if ("0" != result?.text.toString()) {
                    result?.text = result?.text.toString() + '7'
                } else {
                    result?.text = 7.toString()
                }
            } else {
                result?.text = 7.toString()
                operationFlag = false
            }
        })

        eightButton?.setOnClickListener({
            if (!operationFlag) {
                if ("0" != result?.text.toString()) {
                    result?.text = result?.text.toString() + '8'
                } else {
                    result?.text = 8.toString()
                }
            } else {
                result?.text = 8.toString()
                operationFlag = false
            }
        })

        nineButton?.setOnClickListener({
            if (!operationFlag) {
                if ("0" != result?.text.toString()) {
                    result?.text = result?.text.toString() + '9'
                } else {
                    result?.text = 9.toString()
                }
            } else {
                result?.text = 9.toString()
                operationFlag = false
            }
        })

        backSpaceButton?.setOnClickListener({
            val r = result?.text
            if (result?.text?.length == 1 || result?.text?.length == 2 && result?.text.toString().startsWith("-")) {
                result?.text = "0"
            } else if (result?.text!!.matches((Regex(".*\\.[0-9]")))) {
                result?.text = r?.subSequence(0, r.length - 2)
            } else {
                result?.text = r?.subSequence(0, r.length - 1)
            }
        })

        clearButton?.setOnClickListener({
            result?.text = "0"
            memory = 0.0
            operation = ""
        })

        plusMinusButton?.setOnClickListener({
            if ("0" != result?.text.toString()) {
                if (result?.text.toString().startsWith("-")) {
                    result?.text = result?.text.toString().substring(1, result?.text.toString().length)
                } else {
                    result?.text = "-" + result?.text.toString()
                }
            }
        })

        minusButton?.setOnClickListener({
            memory = result?.text.toString().toDouble()
            operation = "-"
            operationFlag = true
        })

        plusButton?.setOnClickListener({
            memory = result?.text.toString().toDouble()
            operation = "+"
            operationFlag = true
        })

        divisionButton?.setOnClickListener({
            memory = result?.text.toString().toDouble()
            operation = "/"
            operationFlag = true
        })

        multiplyButton?.setOnClickListener({
            memory = result?.text.toString().toDouble()
            operation = "*"
            operationFlag = true
        })

        pointButton?.setOnClickListener({
            if (!result?.text.toString().contains(".")) {
                result?.text = result?.text.toString() + '.'
            }
        })

        equalButton?.setOnClickListener({
            val number: Double = result?.text.toString().toDouble()
            when (operation) {
                "*" -> {
                    result?.text = (memory * number).toString()
                    operationFlag = false
                    operation = ""
                    memory = 0.0
                }
                "/" -> {
                    if (number.toInt() == 0) {
                        //vb.vibrate(500)
                        Toast.makeText(this@MainActivity, "Nie dziel przez 0!", Toast.LENGTH_LONG).show()
                    } else {
                        result?.text = (memory / number).toString()
                        operationFlag = false
                        operation = ""
                        memory = 0.0
                    }
                }
                "+" -> {
                    result?.text = (memory + number).toString()
                    operationFlag = false
                    operation = ""
                    memory = 0.0
                }
                "-" -> {
                    result?.text = (memory - number).toString()
                    operationFlag = false
                    operation = ""
                    memory = 0.0
                }
                else -> {
                }
            }
            if (result?.text!!.endsWith(".0")) {
                result?.text = result?.text!!.substring(0, result?.text!!.length.minus(2))
            }
        })

    }

    private fun initButtons() {
        backSpaceButton = findViewById<View>(com.calculator.R.id.backSpaceButton) as Button
        clearButton = findViewById<View>(com.calculator.R.id.clearButton) as Button
        plusMinusButton = findViewById<View>(com.calculator.R.id.plusMinusButton) as Button
        divisionButton = findViewById<View>(com.calculator.R.id.divisionButton) as Button
        nineButton = findViewById<View>(com.calculator.R.id.nineButton) as Button
        eightButton = findViewById<View>(com.calculator.R.id.eightButton) as Button
        sevenButton = findViewById<View>(com.calculator.R.id.sevenButton) as Button
        multiplyButton = findViewById<View>(com.calculator.R.id.multiplyButton) as Button
        sixButton = findViewById<View>(com.calculator.R.id.sixButton) as Button
        fiveButton = findViewById<View>(com.calculator.R.id.fiveButton) as Button
        fourButton = findViewById<View>(com.calculator.R.id.fourButton) as Button
        oneButton = findViewById<View>(com.calculator.R.id.oneButton) as Button
        twoButton = findViewById<View>(com.calculator.R.id.twoButton) as Button
        threeButton = findViewById<View>(com.calculator.R.id.threeButton) as Button
        minusButton = findViewById<View>(com.calculator.R.id.minusButton) as Button
        zeroButton = findViewById<View>(com.calculator.R.id.zeroButton) as Button
        pointButton = findViewById<View>(com.calculator.R.id.pointButton) as Button
        equalButton = findViewById<View>(com.calculator.R.id.equalButton) as Button
        plusButton = findViewById<View>(com.calculator.R.id.plusButton) as Button
        result = findViewById<View>(com.calculator.R.id.result) as TextView
    }
}
