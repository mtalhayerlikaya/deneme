package com.example.ileriseviyekotlin

data class Person(val name: String, val age: Int)

fun main() {
     val people = listOf(Person("Alice", 29), Person("Bob", 31))
     println(people.maxByOrNull { it.age })

    val sum = { x: Int, y: Int ->
        println("the sum is:${x+y}")
    }
    println(sum(1,2))

    val list = listOf<String>("Talha","Enes","Esra")
   // printMessagesWithPrefix(list,)


}

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}