package main.accessModifier

open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4  // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
}

class Unrelated(val o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either

    fun accessDemo() {

    }
}

open class A {
    protected val i = 1
}

class B : A() {
    fun getValue() : Int {
        return i
    }
}

class C {
    fun getValue() : Int {
        val a = A()
//        return a.i  cannot access due to protected
        return 10
    }
}