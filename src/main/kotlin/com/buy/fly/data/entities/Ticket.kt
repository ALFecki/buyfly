package com.buy.fly.data.entities



data class Ticket(
    val flight: Flight,
    val number: Int,
    val reserved: Boolean,
    val price: Double,
)
