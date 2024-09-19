package com.nudriin

// Cara membuat primary constructor
class Enemy(var name: String, var age: Int, var isEnemy: Boolean) {

}

// membuat propertynya memiliki default value
class EnemyWithDefault(var name: String, var age: Int = 0, var isEnemy: Boolean) {

}

class InitBlock(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.name = name
        this.weight = weight
        this.age = age
        this.isMammal = isMammal
    }
}

fun main() {
    val enemy = Enemy("Mark", 23, true)

    println(enemy.name)
    println(enemy.age)
    println(enemy.isEnemy)

    val  enemyWithDefault = EnemyWithDefault(name = "Zuck", isEnemy = true)
    println(enemyWithDefault.name)
    println(enemyWithDefault.age)
    println(enemyWithDefault.isEnemy)

    val initBlock = InitBlock("Whale", 5000.0,120, true)
    println(initBlock.name)
    println(initBlock.weight)
    println(initBlock.age)
    println(initBlock.isMammal)
}