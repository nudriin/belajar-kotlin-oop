package com.nudriin

// Membuat class Animal
class Animal {
    var name: String = "Kucing"
    var weight: Double = 3.2
    var age: Int = 2
    var isMammal: Boolean = true

    fun eat(){
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

class Cat {
    var name: String = "Kuro"

//        Membuat getter, apabila di object di panggil
//        misal cat = Cat()
//        kemudidan memanggil cat.name, maka getter akan di panggil
        get() {
            println("Getter")
            return  field
        }
//       apabila cat.name = "Nama baru"
//       maka akan menggil setter ini
        set(value) {
            println("Setter")
            field = value
        }
}

fun main() {
//    Membuat object dari Animal
    val animal: Animal = Animal()


    animal.eat()
    animal.sleep()

    animal.name = "Kura - Kura"
    animal.eat()

    val  cat = Cat()
    println("Cat name : ${cat.name}") // akan memanggil getter
    cat.name = "Shiro" // akan memanggil setter
    println("Cat name : ${cat.name}") // akan memanggil getter
}