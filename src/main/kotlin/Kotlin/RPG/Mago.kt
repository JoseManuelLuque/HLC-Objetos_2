package Kotlin.RPG

class Mago(nombre: String, puntosDeVida: Int, ataque: Int, var mana: Int) : Personaje(nombre, puntosDeVida, ataque) {
    val hechizos = mutableListOf<Hechizo>()

    override fun atacar(objetivo: Personaje) {
        if (hechizos.isNotEmpty()) {
            val hechizo = hechizos.random()
            usarHechizo(hechizo, objetivo)
        } else {
            println("$nombre no tiene hechizos y ataca con su bastón.")
            objetivo.puntosDeVida -= ataque
            println("${objetivo.nombre} tiene ahora ${objetivo.puntosDeVida} puntos de vida.")
        }
    }

    fun usarHechizo(hechizo: Hechizo, objetivo: Personaje) {
        if (mana >= hechizo.costoMana) {
            println("$nombre usa ${hechizo.nombre} en ${objetivo.nombre}.")
            objetivo.puntosDeVida -= hechizo.dano
            mana -= hechizo.costoMana
            println("${objetivo.nombre} tiene ahora ${objetivo.puntosDeVida} puntos de vida.")
            println("$nombre tiene ahora $mana de mana.")
        } else {
            println("$nombre no tiene suficiente mana para usar ${hechizo.nombre}.")
        }
    }

    fun aprenderHechizo(hechizo: Hechizo) {
        hechizos.add(hechizo)
        println("$nombre ha aprendido ${hechizo.nombre}.")
    }
}
