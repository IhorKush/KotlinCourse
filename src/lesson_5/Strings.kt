package lesson_5

import java.util.Locale
import java.util.Locale.getDefault

fun main() {
//    val s = "Hello World"
//    val cardNumber = "1234 7634 0978 3471"
//
//    println(s.first())
//    println(s.last())
//
//    println()
//
//    println(cardNumber.startsWith("1234")) // true
//    println(cardNumber.endsWith("3470")) // false
//
//    val a = "Hello"
//    println("The length of \"Hello\" is ${a.length}")
//
//    val name = "ihor"
//    val newName = name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(getDefault()) else it.toString() }
//    val upperName = name.uppercase(getDefault())
//    println(newName)
//    println(upperName)
//
//    val name = ""
//    println(name.isEmpty())
//    println(name.isBlank())
//
//    val name = " Ihor"
//    println(name.trim())
//
//    val str = "Good evening every one"
//    val rep = str.replace("one", "*")
//    println(rep)
//
//    val list = "Milk,Bread,Oranges,Kiwi"
//    val arr = list.split(",")

//    println(arr[2])
//    println("Enter the text: ")
    val input = readln()
    println(input.uppercase(getDefault()))


}