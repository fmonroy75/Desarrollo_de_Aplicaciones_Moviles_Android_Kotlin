package com.example.myapp2


import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_config.*

class Config : AppCompatActivity() {
    lateinit var txt:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config)

        txt=findViewById(R.id.text)
//        setupItalica()
//        setupresaltado()
//        setupstylo()
    }

    fun setupItalica(v:View){
        if (sw1.isChecked  ){
            txt.setTypeface(null,Typeface.ITALIC)
        }else{
            txt.setTypeface(null,Typeface.NORMAL)
        }
    }

    fun setupresaltado(v:View){
        if (sw2.isChecked  ){
            txt.setTextColor(getColorValue (R.color.teal_700))
        }else{
            txt.setTextColor(getColorValue (R.color.black))
        }
    }
    fun getColorValue(@ColorRes colorRes:Int):Int{
        return ContextCompat.getColor(this,colorRes)
    }

    fun setupstylo(v:View){
        if (sw3.isChecked  ){
            act.setBackgroundColor(Color.GRAY)
        }else{
            act.setBackgroundColor(Color.WHITE)
        }
    }

    fun setfondo(v: View){
        var v:String
        if (sw3.isChecked  ) {
            v = "g"
        }else{
            v = "w"
        }
        val i1= Intent   (this,MainActivity::class.java)
            i1.putExtra("back",v)
            startActivity(i1)
            //putExtra(act.background)

    }

}