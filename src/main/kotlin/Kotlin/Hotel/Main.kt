package Kotlin.Hotel

fun main() {
    val hotel = Hotel()

    val habitacion1 = Habitacion(1, 101, "Simple")
    val habitacion2 = Habitacion(2, 102, "Doble")

    val cliente1 = Cliente(1, "Antonio Perez")
    val cliente2 = Cliente(2, "Josema Luque")

    hotel.agregarHabitacion(habitacion1)
    hotel.agregarHabitacion(habitacion2)

    hotel.registrarCliente(cliente1)
    hotel.registrarCliente(cliente2)

    hotel.reservarHabitacion(1, 1, "01/01/2024", "05/01/2024")
    hotel.reservarHabitacion(2, 2, "02/01/2024", "06/01/2024")

    hotel.mostrarReservasActivas()

    hotel.cancelarReserva(1)

    hotel.mostrarReservasActivas()
}
