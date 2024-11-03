package Java.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Habitacion habitacion1 = new Habitacion(1, 101, "Simple");
        Habitacion habitacion2 = new Habitacion(2, 102, "Doble");

        Cliente cliente1 = new Cliente(1, "Ana López");
        Cliente cliente2 = new Cliente(2, "Juan Pérez");

        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);

        hotel.registrarCliente(cliente1);
        hotel.registrarCliente(cliente2);

        hotel.reservarHabitacion(1, 1, "01/01/2023", "05/01/2023");
        hotel.reservarHabitacion(2, 2, "02/01/2023", "06/01/2023");

        hotel.mostrarReservasActivas();

        hotel.cancelarReserva(1);

        hotel.mostrarReservasActivas();
    }
}
