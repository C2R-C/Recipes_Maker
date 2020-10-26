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
                "1" -> makeRecipe()
                "2" -> viewRecipe()
                !in "1".."3" -> println("\"$respuesta\" no es una opción válida, vuelve a intentarlo\n")
            }

    } while (respuesta != "3")
    println("Vuelve pronto :)")
}

fun makeRecipe(){
    val menuMakeRecipe: String = """
        Hacer receta
        Selecciona por categoría el ingrediente que buscas
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceites
        0. Volver al menú principal
        
    """.trimIndent()

    do {
        println(menuMakeRecipe)
        val respuestaMenu = readLine().toString()

        when (respuestaMenu) {
            "1" -> println("Agregaste la opción \"$respuestaMenu\": Agua\n")
            "2" -> println("Agregaste la opción \"$respuestaMenu\": Leche\n")
            "3" -> println("Agregaste la opción \"$respuestaMenu\": Carne\n")
            "4" -> println("Agregaste la opción \"$respuestaMenu\": Verduras\n")
            "5" -> println("Agregaste la opción \"$respuestaMenu\": Frutas\n")
            "6" -> println("Agregaste la opción \"$respuestaMenu\": Cereal\n")
            "7" -> println("Agregaste la opción \"$respuestaMenu\": Huevos\n")
            "8" -> println("Agregaste la opción \"$respuestaMenu\": Aceites\n")
            "0" -> println("\n")
            !in "0".."8" -> println("\"$respuestaMenu\" no es una opción válida, vuelve a intentarlo\n")
        }

    } while (respuestaMenu != "0")
    println("De regreso al menú principal")
}

fun viewRecipe(){

    println("Ver mis recetas\n")
    println("Para volver al menu principal oprime enter")
    readLine()
}







