
    fun main() {
        var ejercicio:Int=0
        do {
            println("Escribe el número de ejercicio que quieres ver, escribe 0 si quieres salir")
            println("Los ejercicios de Kotlin son los 1,3,5,7,8")
            ejercicio = readLine()!!.toInt()
            if (ejercicio==1){
                //Ejercicio 1 Kotlin
                var vida: Int = 100
                var personaje: String = "Naruto"
                println("El personaje " + personaje + " tiene " + vida + " puntos de vida")
                //aquí en kotlin se escribe primero el nombre de la variable y luego pones el tipo (opcional)
            }
            if (ejercicio==3) {
                //Ejercicio 3 Kotlin
                var cofres = arrayOf("espada", "escudo", "poción")
                for (cofre in cofres) {
                    println("Has encontrado: " + cofre)
                }
            }
            if (ejercicio==5) {
                //Ejercicio 5 Kotlin
                val goku = Personaje("Goku", 100, 50)
                goku.mostrarInfo()
            }
            if (ejercicio==7) {
                //Ejercicio 7 Kotlin
                println(Multiplicar(5))
                // Lambda en Kotlin
                val operacion: (Int, Int) -> Int = { a, b -> a + b }
                println(operacion(3, 4))
            }
            if (ejercicio==8){
                //Ejercicio 8 Kotlin
                val goku = Personaje("Goku", 100, 20)
                val vegeta = Personaje("Vegeta", 80, 25)
                while (goku.vida > 0 && vegeta.vida > 0) {
                    goku.vida -= vegeta.ataque
                    vegeta.vida -= goku.ataque
                    println("Vida de Goku: " + goku.vida)
                    println("Vida de Vegeta: " + vegeta.vida)
                }
                if (goku.vida <= 0) {
                    println("Vegeta ha ganado el combate.")
                } else {
                    println("Goku ha ganado el combate.")
                }
            }
            //Ejercicio
        }while (ejercicio!=0)
        println("Ejercicio realizado por Daniel Hernández Gómez")
    }

    fun Multiplicar(numero:Int): Int {
        return numero*2
    }