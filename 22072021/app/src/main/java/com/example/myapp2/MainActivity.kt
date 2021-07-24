package com.example.myapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var listaOper=arrayOf("Sumar","Restar","Multiplicar","Dividir")
    //val spinner: Spinner =findViewById(R.id.spOper)





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bundle:Bundle?=intent.extras
        val s:String?=bundle?.getString("back")

        Toast.makeText(this,"el valor de s es "+s,Toast.LENGTH_LONG).show()
        if (!s.isNullOrEmpty()){
            Toast.makeText(this,s.toString(),Toast.LENGTH_LONG).show()
            //MainActivity.setBackgroundColor(s.toInt())
        }


        val array_adapter=ArrayAdapter(this,android.R.layout.simple_spinner_item,listaOper)
        array_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spOper.adapter=array_adapter



        btnCalcular.setOnClickListener {
            if(spOper.selectedItem.toString()=="Sumar"){
                var r:Int
                r=Sumar(ednum1.text.toString().toInt(),ednum2.text.toString().toInt())
                txtResult.text="resultado es"+r
            }else if (spOper.selectedItem.toString()=="Restar"){
                txtResult.text=Restar(ednum1.text.toString().toInt(),ednum2.text.toString().toInt())
            }else if (spOper.selectedItem.toString()=="Multiplicar"){
                txtResult.text=Mult(ednum1.text.toString().toInt(),ednum2.text.toString().toInt())
            }else if (spOper.selectedItem.toString()=="Dividir") {
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

    fun Settings(v: View){
        val i1=Intent(this,Config::class.java)
        startActivity(i1)
    }
}