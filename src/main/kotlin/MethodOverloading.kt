package com.nudriin

class Animal3(private var name: String) {
    fun eat() {
        println("$name makan!")
    }

    fun eat(typeFood: String) {
        println("$name memakan $typeFood!")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {
    val cat = Animal3("Dicoding Miaw")

    cat.eat()
    cat.eat("Ikan Tuna") // kan mengoverload
    cat.eat("Ikan Tuna", 450.0) // akan mengoverload
}