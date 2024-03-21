package com.liud.kotlin_course

//Global values

var num1:Int = 4
var num2:Int = 6

// Function without return or parameter
fun SimpleFunction(){
    println("This is a simple function")
}

// Function without return but with parameter
fun ParameterFunction(value:String){
    println(value)
}

// Function with return without parameter

fun ReturnFunction():Int{
    return num1+ num2
}

// Function with return and parameter

fun ReturnParamFunction(value: Int):Int{
    return value
}

