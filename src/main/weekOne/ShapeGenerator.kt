@file:JvmName("ShapesGenerator")
package main.weekOne


data class Square(val width: Int, val height: Int)

data class Rectangle(val width: Int, val height: Int)

fun generateSquare() = Square(10, 10)
fun generateRectangle() = Rectangle(20, 20)



