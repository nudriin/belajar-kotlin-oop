package com.nudriin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
    *
    * Pada Kotlin, nilai primitif seperti String, Integer, Char, Boolean
    * merupakan sebuah Object. Hal ini berbeda dengan bahasa pemrograman lain.
    * Maka dari itu, terdapat sebuah istilah yang terkenal di  Kotlin,
    * yaitu “Object Everywhere”.
    *
    * */
    var someString = "Dicoding"
    println(someString.reversed())
    println(someString.uppercase())
    println(someString.lowercase())

    someString = "123"
    val someInt = someString.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)

}