package com.buy.fly.services

import com.buy.fly.data.entities.Flight
import com.buy.fly.data.repositories.FlightRepository
import com.buy.fly.forms.FlightDto
import jakarta.inject.Singleton



@Singleton
class FlightService(
    private val flightRepository: FlightRepository
) : IService<FlightDto, Flight> {
    override fun createItem(item: FlightDto): Flight {
        return Flight(
            number = item.number,
            departure = item.departure,
            arrival = item.arrival,
            date = item.date,
            aircraft = item.aircraft
        )
    }

    override fun find(alias: String): Flight? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Flight>? {
        TODO("Not yet implemented")
    }

    override fun insertAllItems(items: List<FlightDto>): List<Flight> {
        TODO("Not yet implemented")
    }

    override fun insertItem(item: FlightDto): Flight {
        TODO("Not yet implemented")
    }

    override fun deleteAll(items: List<Flight>): List<Flight> {
        TODO("Not yet implemented")
    }

    override fun delete(item: Flight): Flight {
        TODO("Not yet implemented")
    }


}