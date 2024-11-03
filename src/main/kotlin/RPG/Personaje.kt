package RPG

abstract class Personaje(
    val nombre: String,
    var puntosDeVida: Int,
    var ataque: Int
) {
    abstract fun atacar(objetivo: Personaje)
}
