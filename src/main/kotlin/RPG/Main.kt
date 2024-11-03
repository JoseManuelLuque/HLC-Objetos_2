package RPG

fun main() {
    val guerrero = Guerrero("Guerrero1", 100, 15)
    val mago = Mago("Mago2", 80, 10, 50)

    val bolaDeFuego = Hechizo("Bola de Fuego", 25, 15)
    val rayo = Hechizo("Rayo", 20, 10)

    mago.aprenderHechizo(bolaDeFuego)
    mago.aprenderHechizo(rayo)

    guerrero.atacar(mago)
    mago.atacar(guerrero)
}
