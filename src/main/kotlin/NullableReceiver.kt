package com.nudriin

// kita bisa juga mendeklarasikan sebuah extension dengan nullable receiver type.
// Alhasil, extension tersebut bisa dipanggil pada objek yang bahkan nilainya null.
val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)

fun main() {
    val value: Int? = null

    println(value.slice)
}