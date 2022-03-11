package com.example.ileriseviyekotlin


//generic class lar compile edilirken tipleri silinir
//bundan dolayı generic class tipine ulasmak istersek bu sekilde kullanmalıyız
inline fun <reified T> genericsExample(value: T) {
    println(value)
    println("Type of T: ${T::class.java}")
}