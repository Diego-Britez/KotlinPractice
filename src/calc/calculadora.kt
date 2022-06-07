package calc


fun main() {

    println("Ingrese un numero: ")
    val user1 = readLine()!!.toInt()

    println("Ingrese un numero: ")
    val user2 = readLine()!!.toInt()

    println("Elija una operacion")
    val result = readLine()!!.toString()

    println("Resultado: ")

    when (result) {
        "suma" -> println(user1 + user2)
        "resta" -> println(user1 - user2)
        "multiplicacion" -> println(user1 * user2)
        "division" -> println(user1 / user2)

        else -> println("$result no es una opcion valida")

    }

}



