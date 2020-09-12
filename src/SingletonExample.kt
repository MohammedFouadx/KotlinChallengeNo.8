object Singleton {
    init {
        println("Singleton pattern")
    }

    var message = "Rwad"

    fun showMessage() {
        println(message)
    }
}

class Test {
    init {
        Singleton.showMessage()
    }
}

fun main(args:Array<String>) {
    Singleton.showMessage()
    Singleton.message = "Coding Academy"

    val newMessage = Test()
}