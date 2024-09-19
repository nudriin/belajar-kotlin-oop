package com.nudriin

import kotlin.reflect.KProperty

/*
* membuat sebuah kelas yang memang bertugas untuk mengatur
* atau mengelola fungsi getter dan setter untuk sebuah properti kelas
* */

class DelegateName {
    private var value: String = "Default"

    // Membuat getter
    operator fun getValue(classRef: Any, property: KProperty<*>): String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return  value
    }

    // Membuat setter
    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}



    // Cara menggunakannya
class Dog {
    var name: String by DelegateName() // maka value ini akan di kelola oleh delegate
}

class Person {
    var name: String by DelegateName() // maka value ini akan di kelola oleh delegate
}

fun main() {
    val person = Person()
    val dog = Dog()

    println(person.name)
    println(dog.name)

    person.name = "Elon Musk"
    dog.name = "Haci"
    println(person.name)
    println(dog.name)
}