package com.example.ileriseviyekotlin

import android.view.View

/*
    Unlike a Java anonymous inner class, which can only extend one class or implement
one interface, a Kotlin anonymous object can implement multiple interfaces or no
interfaces.
 */

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable,Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

}

/*  interface Expr
    class Num(val value: Int) : Expr
    class Sum(val left: Expr, val right: Expr) : Expr


fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }*/
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
    class Mult(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
        is Expr.Mult -> eval(e.right) * eval(e.left)
    }

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
Address was changed for $name:
"$field" -> "$value".""".trimIndent())
            field = value
        }
}

class Deneme(var name: String) {


   companion object{
       var name_:String=""
       fun asd(){
           name_ ="dsad"
       }
   }

    fun asd(){
        name_ ="dsad"
    }

}

class LenthWord(){

  var counter : Int = 0
      private set

    fun addWord(word:String){
      counter += word.length
  }

}

class Client(val name: String, val postalCode: Int) {
    val obj:Client
        get() {
            return obj
        }


    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
    override fun hashCode(): Int {
        return obj.hashCode()
    }

}

abstract class A() {
     abstract var d:Int
     abstract fun asd()

}

interface C {
    var a:Int

     fun bsc(){
         println("asdasd")
    }

}

class B(override var a: Int):A(),C {
    override var d: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun asd() {
        println("deneme")
    }



}


/*class Nested() {
    var outer:String="outer"
    inner class nested{
        var inner:String="inner"
        fun asd() {
            outer
        }
    }



}*/


fun main() {
    /*val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()*/
   // val obje = Nested.nested().inner
}

