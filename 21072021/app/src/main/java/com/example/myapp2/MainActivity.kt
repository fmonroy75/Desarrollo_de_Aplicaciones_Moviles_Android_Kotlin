package com.example.myapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {
            if (rb1.isChecked){
                var r:Int
                r=Sumar(ednum1.text.toString().toInt(),ednum2.text.toString().toInt())
                Toast.makeText(this,"despues fun",Toast.LENGTH_LONG).show()
                txtResult.text="resultado es"+r
            }else if (rb2.isChecked){
                txtResult.text=Restar(ednum1.text.toString().toInt(),ednum2.text.toString().toInt())
            }else if (rb3.isChecked){
                txtResult.text=Mult(ednum1.text.toString().toInt(),ednum2.text.toString().toInt())
            }else if (rb4.isChecked) {
                if (ednum2.text.toString().toInt() > 0) {
                    txtResult.text = Dividir(ednum1.text.toString().toInt(),ednum2.text.toString().toInt())
                } else{
                    Toast.makeText(this,"Error :No se puede divir por 0",Toast.LENGTH_LONG).show()
                }
            }
        }


    }


    fun Sumar(n1:Int,n2:Int):Int{
        var res:Int=0
        res=n1+n2
        return res
    }

    fun Restar(n1:Int,n2:Int):String{
        var res:Int=0
        res=n1-n2
        return res.toString()
    }
    fun Mult(n1:Int,n2:Int):String{
        var res:Int=0
        res=n1*n2
        return res.toString()
    }
    fun Dividir(n1:Int,n2:Int):String{
        var res:Double
        res=n1.toDouble()/n2.toDouble()
        return res.toString()
    }
}