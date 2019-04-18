package main.weekOne

import java.awt.Point

private var name = "Darshan"
private var lastName: String? = null
private lateinit var middleName: String
val preference: String by lazy {
    println("Demo")
    "Darshan"
}

fun main() {

    println(name ?: "Default")
    println(lastName ?: "Default")
    println(lastName?.length) // Safe call operator

    val p1 = Person("Darshan", 10)
    val (x, y) = p1
    println("$x-$y")

    println(preference)
    println(preference)

    middleName = "J"
    println("This is lateinit $middleName")

    onlyIf(true) {
        println("Inline function => calls will be replaced with the function body.")
    }

    onlyIf(false) {
        println("Inline function => calls will be replaced with the function body.")
    }

    val pointOperator = PointOperator(10, 20)
    println(-pointOperator)

    val counter = Counter(10)
    println(counter + 10)

    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

}

inline fun onlyIf(check: Boolean, operation: () -> Unit) {
    if (check) {
        operation()
    }
}

data class Person(val name: String, val age: Int)

data class PointOperator(val x: Int, val y: Int)

operator fun PointOperator.unaryMinus() = PointOperator(-x, -y)

data class Counter(val dayIndex: Int) {
    operator fun plus(increment: Int): Counter {
        return Counter(dayIndex + increment)
    }
}
