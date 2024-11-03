package Java.Hotel;

public class Habitacion {
    private int id;
    private int numero;
    private String tipo;
    private boolean disponible;

    public Habitacion(int id, int numero, String tipo) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "id=" + id +
                ", numero=" + numero +
                ", tipo='" + tipo + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
