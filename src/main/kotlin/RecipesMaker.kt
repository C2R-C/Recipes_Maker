fun main() {

    val saludo: String = """
        :: Bienvenido a Recipe Maker ::
        
        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()

    do {
        println(saludo)
        val respuesta = readLine().toString()

             when (respuesta) {
                "1" -> println("Escogiste la opción \"$respuesta\": Vamos a hacer esa receta\n")
                "2" -> println("Escogiste la opción \"$respuesta\": Miremos tus recetas\n")
                !in "1".."3" -> println("\"$respuesta\" no es una opción válida, vuelve a intentarlo\n")
            }

    } while (respuesta != "3")
    println("Vuelve pronto :)")
}







