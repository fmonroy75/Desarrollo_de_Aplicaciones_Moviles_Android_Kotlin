package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    val autoFragment=autoFragment()
    val avionFragment=avionFragment()
    val trenFragment=trenFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottom_navigation=findViewById<BottomNavigationView>(R.id.bottom_navigation)
        reemplazar(autoFragment)
        bottom_navigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.auto ->reemplazar(autoFragment)
                R.id.avion ->reemplazar(avionFragment)
                R.id.tren ->reemplazar(trenFragment)
            };
            true
        }
    }

    fun reemplazar(fragment:Fragment){
        if (fragment!=null){
            val transaction=supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container,fragment)
            transaction.commit()
        }
    }
}