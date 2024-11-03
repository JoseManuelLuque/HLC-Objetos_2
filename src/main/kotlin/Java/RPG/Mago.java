package Java.RPG;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personaje {
    private int mana;
    private List<Hechizo> hechizos;

    public Mago(String nombre, int puntosDeVida, int ataque, int mana) {
        super(nombre, puntosDeVida, ataque);
        this.mana = mana;
        this.hechizos = new ArrayList<>();
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (!hechizos.isEmpty()) {
            Hechizo hechizo = hechizos.get(new Random().nextInt(hechizos.size()));
            usarHechizo(hechizo, objetivo);
        } else {
            System.out.println(nombre + " no tiene hechizos y ataca con su bastón.");
            objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() - ataque);
            System.out.println(objetivo.getNombre() + " tiene ahora " + objetivo.getPuntosDeVida() + " puntos de vida.");
        }
    }

    public void usarHechizo(Hechizo hechizo, Personaje objetivo) {
        if (mana >= hechizo.getCostoMana()) {
            System.out.println(nombre + " usa " + hechizo.getNombre() + " en " + objetivo.getNombre() + ".");
            objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() - hechizo.getDano());
            mana -= hechizo.getCostoMana();
            System.out.println(objetivo.getNombre() + " tiene ahora " + objetivo.getPuntosDeVida() + " puntos de vida.");
            System.out.println(nombre + " tiene ahora " + mana + " de mana.");
        } else {
            System.out.println(nombre + " no tiene suficiente mana para usar " + hechizo.getNombre() + ".");
        }
    }

    public void aprenderHechizo(Hechizo hechizo) {
        hechizos.add(hechizo);
        System.out.println(nombre + " ha aprendido " + hechizo.getNombre() + ".");
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
