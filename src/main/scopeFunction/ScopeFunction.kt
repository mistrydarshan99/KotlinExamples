package main.scopeFunction

class Society(var id: Int, var name: String)

val society: Society? = null
fun main() {

    society?.run {
        println(society.id)
    }
    run {
        println(society?.id)
    }
    society?.let {

    }
    with(society){
        println(this?.id)
    }


    val society = Society(1, "Lasky")
    society.apply {
        id = 2
    }

    society.also {
        it.id = 3
    }
    with(society){
        println(id)
    }

}