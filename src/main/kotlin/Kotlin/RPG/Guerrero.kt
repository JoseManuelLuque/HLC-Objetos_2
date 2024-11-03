package Kotlin.RPG

class Guerrero(nombre: String, puntosDeVida: Int, ataque: Int) : Personaje(nombre, puntosDeVida, ataque) {
    override fun atacar(objetivo: Personaje) {
        println("$nombre ataca a ${objetivo.nombre} con su espada.")
        objetivo.puntosDeVida -= ataque
        println("${objetivo.nombre} tiene ahora ${objetivo.puntosDeVida} puntos de vida.")
    }
}
