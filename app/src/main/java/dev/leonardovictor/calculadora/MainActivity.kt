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
        btnZero.setOnClickListener { }
        btnOne.setOnClickListener { }
        btnTwo.setOnClickListener { }
        btnThree.setOnClickListener { }
        btnFour.setOnClickListener { }
        btnFive.setOnClickListener { }
        btnSix.setOnClickListener { }
        btnSeven.setOnClickListener { }
        btnEight.setOnClickListener { }
        btnNine.setOnClickListener { }

        // operators
        btnSum.setOnClickListener { }
        btnSubtract.setOnClickListener { }
        btnDivide.setOnClickListener { }
        btnMultiply.setOnClickListener { }

        // clear
        btnClear.setOnClickListener { }

        // result
        btnResult.setOnClickListener { }
    }
}

