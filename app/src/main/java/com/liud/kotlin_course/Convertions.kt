package com.liud.kotlin_course

fun Convertios(){

    // Cast a type to other

    var numberInt = 8

    var chainString:String = numberInt.toString()
    println(chainString)

    // Concat variables or const with type String variable
    print("This is a numeric var $numberInt, and this is a numeric var covert to 'String' type $chainString")

    // Another way to concat string

    println(chainString + "this is concat also")

}