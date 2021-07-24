package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

var edad:Int =46
var nota: Double= 6.9
var nombre :String="Francisco"



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncalcular.setOnClickListener {
            var v1=editnum1.text.toString().toInt()+editnum2.text.toString().toInt()
            txtResultado.text=v1.toString()
        }

        //editnum1=findViewById<EditText>(R.layout.activity_main)

    }

    fun boton(v: View){
        Toast.makeText(this,"Nombre: "+nombre+", edad: "+edad+", promedio: "+nota,Toast.LENGTH_LONG).show()
    }
    fun sumar(v:View){
        var v1:Int=editnum1.text.toString().toInt()
        var v2:Int=editnum2.text.toString().toInt()
        var suma:Int=v1+v2
        txtResultado.text="Resultado es: "+ suma
    }
}