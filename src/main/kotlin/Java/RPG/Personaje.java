package Java.RPG;

public abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected int ataque;

    public Personaje(String nombre, int puntosDeVida, int ataque) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.ataque = ataque;
    }

    public abstract void atacar(Personaje objetivo);

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getAtaque() {
        return ataque;
    }
}
