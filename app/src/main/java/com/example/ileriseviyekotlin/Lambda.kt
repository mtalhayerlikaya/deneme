package com.example.ileriseviyekotlin

data class Person(val name: String, val age: Int)

fun main() {
     val people = listOf(Person("Alice", 29), Person("Bob", 31))
     println(people.maxByOrNull { it.age })

    val sum = { x: Int, y: Int -> x + y }

    { println(42) }()

}