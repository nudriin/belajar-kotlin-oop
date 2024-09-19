package com.nudriin

interface IFly {
    val name: String
    fun fly()
}

class Bird(override val name: String) : IFly {
    override fun fly() {
        println("${this.name} is fly")
    }
}

fun main() {
    val bird = Bird("Cendrawasih")

    bird.fly()
}