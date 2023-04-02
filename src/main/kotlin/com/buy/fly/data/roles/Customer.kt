package com.buy.fly.data.roles

import com.buy.fly.data.entities.Ticket
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity


@MappedEntity
data class Customer(
    override val login: String,
    override val email: String,
    val tickets: MutableList<Ticket>
    ) : User() {
        @Id
        @GeneratedValue
        override val userId: Long = 0

    fun reserveTicket(ticket: Ticket) {
        tickets.add(ticket)
    }

}
