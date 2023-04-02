package com.buy.fly.services

import com.buy.fly.data.entities.Flight
import com.buy.fly.data.repositories.FlightRepository
import jakarta.inject.Singleton



@Singleton
class FlightService(
    private val flightRepository: FlightRepository
) : IService<Flight> {
    override fun createItem(item: Flight): Flight {
        TODO("Not yet implemented")
    }

    override fun find(alias: String): Flight? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Flight>? {
        TODO("Not yet implemented")
    }

    override fun deleteAll(items: List<Flight>): List<Flight> {
        TODO("Not yet implemented")
    }

    override fun delete(item: Flight): Flight {
        TODO("Not yet implemented")
    }

    override fun insertAllItems(items: List<Flight>): List<Flight> {
        TODO("Not yet implemented")
    }

    override fun insertItem(item: Flight): Flight {
        TODO("Not yet implemented")
    }


}