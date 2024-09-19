package com.nudriin

// membuat extensions
fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

val Int.slice: Int
    get() = this / 2

fun Int.sum(value: Int): Int {
    return this + value
}

// Membuat infix function
infix fun Int.add(value: Int): Int {
    return this + value
}

fun main() {
    10.printInt()
    println(10.plusThree())
    println(10.slice)

    var result = 5.sum(3)
    println(result)

    // memanggil infix function
    result = 5 add 3
    println(result)
}