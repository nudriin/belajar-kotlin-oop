package com.nudriin


// Membuat parent class nya
//Untuk membuat sebuah super atau parent class kita akan membutuhkan open class.
// Kelas pada Kotlin secara default bersifat final,
// oleh karena itu kita harus mengubahnya
// menjadi open class sebelum melakukan extends kelas tersebut.
open class Animal4(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

// membuat child class nya
// cara extendsnya menggunakan  ":"
// dan super constructornya terdapat pad Animal4(name, weight, age, isCarnivore)
class Cat2(name: String, weight: Double, age : Int, isCarnivore: Boolean, val furColor: String, val numberOfFeet: Int) : Animal4(name, weight, age, isCarnivore) {
    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat(){
        super.eat() // memanggil super method eat()
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

fun main(){
    val cat = Cat2("Miaw", 3.2, 2, true, "Brown", 4)

    cat.playWithHuman()
    cat.eat()
    cat.sleep()
}

