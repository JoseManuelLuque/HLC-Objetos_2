package Java.RPG;

public class Guerrero extends Personaje {

    public Guerrero(String nombre, int puntosDeVida, int ataque) {
        super(nombre, puntosDeVida, ataque);
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " ataca a " + objetivo.getNombre() + " con su espada.");
        objetivo.setPuntosDeVida(objetivo.getPuntosDeVida() - ataque);
        System.out.println(objetivo.getNombre() + " tiene ahora " + objetivo.getPuntosDeVida() + " puntos de vida.");
    }
}
