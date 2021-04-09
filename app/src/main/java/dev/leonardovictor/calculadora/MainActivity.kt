package dev.leonardovictor.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // numbers
        btnZero.setOnClickListener { addExpression("0", true) }
        btnOne.setOnClickListener { addExpression("1", true) }
        btnTwo.setOnClickListener { addExpression("2", true) }
        btnThree.setOnClickListener { addExpression("3", true) }
        btnFour.setOnClickListener { addExpression("4", true) }
        btnFive.setOnClickListener { addExpression("5", true) }
        btnSix.setOnClickListener { addExpression("6", true) }
        btnSeven.setOnClickListener { addExpression("7", true) }
        btnEight.setOnClickListener { addExpression("8", true) }
        btnNine.setOnClickListener { addExpression("9", true) }

        // operators
        btnSum.setOnClickListener { addExpression("+", false) }
        btnSubtract.setOnClickListener { addExpression("-", false) }
        btnDivide.setOnClickListener { addExpression("/", false) }
        btnMultiply.setOnClickListener { addExpression("*", false) }

        // clear
        btnClear.setOnClickListener {
            txtExpression.text = ""
            txtResult.text = ""
        }

        // result
        btnResult.setOnClickListener {
            try {
                val expression = ExpressionBuilder(txtExpression.text.toString()).build()
                val result = expression.evaluate()
                val longResult  = result.toLong()

                if(result == longResult.toDouble()){
                    txtResult.text = longResult.toString()
                }else{
                    txtResult.text = result.toString()
                }
            }catch (e: Exception){}
        }
        }
    }

    private fun addExpression(string:String, clearData:Boolean){

        if(txtResult.text.isNotEmpty()){
            txtExpression.text = ""
        }

        if(clearData){
            txtResult.text = ""
            txtExpression.append(string)
        }else{
            txtExpression.append(txtResult.text)
            txtExpression.append(string)
            txtResult.text = ""
        }
    }
}

