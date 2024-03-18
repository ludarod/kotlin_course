package com.liud.kotlin_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Main()
    }
}

fun Main(){
    println("Bienvenido")
    println(Constantes())
    println(AritmeticOperations())
}
