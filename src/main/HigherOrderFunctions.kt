package main


fun main() {

    function1(20, onResponse = {
        println("This is function1")
    })

    function2(25, onResponse = {
        println("Value is $it")
    })

    val strValue = function3(51) {
        println("Function3 $it")
        return@function3 "Darshan"
    }
    println(strValue)
}

private fun function1(num: Int, onResponse: () -> Unit) {
    println("------------------------${num}")
    onResponse.invoke()
}

private fun function2(num: Int, onResponse: (Int) -> Unit) {
    onResponse(num)
}

private fun function3(num: Int, onResponse: (Int) -> String) {
    onResponse(num)
}