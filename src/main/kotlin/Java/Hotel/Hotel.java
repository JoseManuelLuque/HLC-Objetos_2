package Java.Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Cliente> clientes;
    private List<Reserva> reservas;

    public Hotel() {
        habitaciones = new ArrayList<>();
        clientes = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
        System.out.println("Habitacion agregada: " + habitacion);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente);
    }

    public boolean reservarHabitacion(int clienteId, int habitacionId, String fechaInicio, String fechaFin) {
        Cliente cliente = clientes.stream().filter(c -> c.getId() == clienteId).findFirst().orElse(null);
        Habitacion habitacion = habitaciones.stream().filter(h -> h.getId() == habitacionId).findFirst().orElse(null);

        if (cliente == null) {
            System.out.println("El cliente con ID " + clienteId + " no existe.");
            return false;
        }
        if (habitacion == null) {
            System.out.println("La habitacion con ID " + habitacionId + " no existe.");
            return false;
        }
        if (!habitacion.isDisponible()) {
            System.out.println("La habitacion número " + habitacion.getNumero() + " no está disponible.");
            return false;
        }

        Reserva reserva = new Reserva(reservas.size() + 1, cliente, habitacion, fechaInicio, fechaFin);
        reservas.add(reserva);
        habitacion.setDisponible(false);
        System.out.println("Habitacion número " + habitacion.getNumero() + " reservada a " + cliente.getNombre() + " desde " + fechaInicio + " hasta " + fechaFin + ".");
        return true;
    }

    public boolean cancelarReserva(int reservaId) {
        Reserva reserva = reservas.stream().filter(r -> r.getId() == reservaId).findFirst().orElse(null);

        if (reserva == null) {
            System.out.println("La reserva con ID " + reservaId + " no existe.");
            return false;
        }

        reserva.getHabitacion().setDisponible(true);
        reservas.remove(reserva);
        System.out.println("Reserva con ID " + reservaId + " cancelada.");
        return true;
    }

    public void mostrarReservasActivas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas activas.");
            return;
        }

        reservas.forEach(reserva -> {
            System.out.println("Reserva ID: " + reserva.getId() + ", Cliente: " + reserva.getCliente().getNombre() + ", Habitacion: " + reserva.getHabitacion().getNumero() + ", Desde: " + reserva.getFechaInicio() + " Hasta: " + reserva.getFechaFin());
        });
    }
}
