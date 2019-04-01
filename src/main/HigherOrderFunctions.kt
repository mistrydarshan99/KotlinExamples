package main


fun main() {

    function1(20, onResponse = {
        println("This is function1")
    })
}

private fun function1(num: Int, onResponse: () -> Unit) {
    println("------------------------${num}")
    onResponse.invoke()
}