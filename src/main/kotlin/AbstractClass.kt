package com.nudriin

abstract class Animal5(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}

class Cat3(name: String, weight: Double, age: Int, isCarnivore: Boolean)
    : Animal5(name, weight, age, isCarnivore){

    }

fun main() {
    val cat = Cat3("Meong", 20.4, 5, true)

    cat.eat()
    cat.sleep()
}