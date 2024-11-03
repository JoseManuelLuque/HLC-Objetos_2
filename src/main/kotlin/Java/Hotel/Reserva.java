package Java.Hotel;

public class Reserva {
    private int id;
    private Cliente cliente;
    private Habitacion habitacion;
    private String fechaInicio;
    private String fechaFin;

    public Reserva(int id, Cliente cliente, Habitacion habitacion, String fechaInicio, String fechaFin) {
        this.id = id;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }
}
