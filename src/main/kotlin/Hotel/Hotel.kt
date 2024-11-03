package Hotel

class Hotel {
    private val habitaciones = mutableListOf<Habitacion>()
    private val clientes = mutableListOf<Cliente>()
    private val reservas = mutableListOf<Reserva>()

    fun agregarHabitacion(habitacion: Habitacion) {
        habitaciones.add(habitacion)
        println("Habitación agregada: $habitacion")
    }

    fun registrarCliente(cliente: Cliente) {
        clientes.add(cliente)
        println("Cliente registrado: $cliente")
    }

    fun reservarHabitacion(clienteId: Int, habitacionId: Int, fechaInicio: String, fechaFin: String): Boolean {
        val cliente = clientes.find { it.id == clienteId }
        val habitacion = habitaciones.find { it.id == habitacionId }

        if (cliente == null) {
            println("El cliente con ID $clienteId no existe.")
            return false
        }
        if (habitacion == null) {
            println("La habitación con ID $habitacionId no existe.")
            return false
        }
        if (!habitacion.disponible) {
            println("La habitación número ${habitacion.numero} no está disponible.")
            return false
        }

        val reserva = Reserva(reservas.size + 1, cliente, habitacion, fechaInicio, fechaFin)
        reservas.add(reserva)
        habitacion.disponible = false
        println("Habitación número ${habitacion.numero} reservada a ${cliente.nombre} desde $fechaInicio hasta $fechaFin.")
        return true
    }

    fun cancelarReserva(reservaId: Int): Boolean {
        val reserva = reservas.find { it.id == reservaId }

        if (reserva == null) {
            println("La reserva con ID $reservaId no existe.")
            return false
        }

        reserva.habitacion.disponible = true
        reservas.remove(reserva)
        println("Reserva con ID $reservaId cancelada.")
        return true
    }

    fun mostrarReservasActivas() {
        if (reservas.isEmpty()) {
            println("No hay reservas activas.")
            return
        }

        reservas.forEach { reserva ->
            println("Reserva ID: ${reserva.id}, Cliente: ${reserva.cliente.nombre}, Habitación: ${reserva.habitacion.numero}, Desde: ${reserva.fechaInicio} Hasta: ${reserva.fechaFin}")
        }
    }
}
