package com.nudriin

    // Lateinit merupakan keyword yang ditambahkan sebelum variabel
    // untuk membuat proses inisialisasi bisa ditunda.
    // var name: String // akan error
    lateinit var name: String // aman

    /* lazy property untuk membuat property yang bukan null
     * dan menunda inisialisasi
     * Dalam menggunakan lazy property, harus menggunakan keyword val.
     * Hal ini karena nilainya hanya dapat diinisialisasi satu kali.
     */
    val name2: String by lazy {
        "Nudriinsss"
    }

    val name3: String = "Test"

fun main() {
    name = "Nudriin"
    println(name.length)

    //Kita juga dapat memeriksa apakah variabel tersebut sudah diinisialisasi
    // dengan menggunakan fungsi isInitialized seperti ini.
    if (::name.isInitialized){
        println(name)
    } else {
        println("Not initialized")
    }

    println(name2)


}
