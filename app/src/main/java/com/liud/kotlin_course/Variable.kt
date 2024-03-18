package com.liud.kotlin_course

fun Constantes(){

    /*
        Se utiliza val para definir un valores con tipos de datos que no variaran en el tiempo
         o se son constantes.
    */

    val nameConstInt = 8 //values of type "int" cover a range between 2...to 2... million

    val nameConstLong:Long = 10000000 // values of type "float" cover a range between 9 to 9...million

    val nameConsteFloat:Float = 5.5f // Float values always must have "f" letter at the end...

    val nameConstDouble:Double = 5.55

    /*
        Valores Alfanumericos
    */

    val nameConstString:String = "Fichero de ejemplo de constante"

    val nameConstChar:Char = '@' // char values only cant store one alphanumeric character.

    /*
        Valores logicos
    */

    val nameConstFalseBoolean:Boolean = false
    val nameConstTrueBoolean:Boolean = true;

    println(nameConstString)
}

fun Variables(){
    /*
        Se utiliza val para definir variables con valores que pueden variarar en el tiempo...
    */

    var nameVariableInt:Int = 8 //values of type "int" cover a range between 2...to 2... million
    nameVariableInt = 5

    var nameVariableLong:Long = 10000000 // values of type "float" cover a range between 9 to 9...million
    nameVariableLong = 150000

    var nameVariableFloat:Float = 5.5f // Float values always must have "f" letter at the end...
    nameVariableFloat = 7.8f

    var nameVariableDouble:Double = 5.55
        nameVariableDouble = 7.88

    /*
        Valores Alfanumericos
    */

    var nameValueString:String = "Fichero de ejemplo de constante"

    var nameValueChar:Char = '@' // char values only cant store one alphanumeric character.
}