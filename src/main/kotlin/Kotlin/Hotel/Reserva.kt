package Kotlin.Hotel

data class Reserva(
    val id: Int,
    val cliente: Cliente,
    val habitacion: Habitacion,
    val fechaInicio: String,
    val fechaFin: String
)
