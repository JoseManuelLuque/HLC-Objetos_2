package Java.RPG;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Thorin", 100, 15);
        Mago mago = new Mago("Gandalf", 80, 10, 50);

        Hechizo bolaDeFuego = new Hechizo("Bola de Fuego", 25, 15);
        Hechizo rayo = new Hechizo("Rayo", 20, 10);

        mago.aprenderHechizo(bolaDeFuego);
        mago.aprenderHechizo(rayo);

        guerrero.atacar(mago);
        mago.atacar(guerrero);
    }
}