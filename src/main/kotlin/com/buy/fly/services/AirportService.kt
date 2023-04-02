package com.buy.fly.services

import com.buy.fly.data.entities.Airport
import com.buy.fly.data.serde.MongoAirport

class AirportService: IService<MongoAirport, Airport> {
    override fun createItem(item: MongoAirport): Airport {
        TODO("Not yet implemented")
    }

    override fun find(alias: String): Airport? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Airport>? {
        TODO("Not yet implemented")
    }

    override fun insertAllItems(items: List<MongoAirport>): List<Airport> {
        TODO("Not yet implemented")
    }

    override fun insertItem(item: MongoAirport): Airport {
        TODO("Not yet implemented")
    }

    override fun deleteAll(items: List<Airport>): List<Airport> {
        TODO("Not yet implemented")
    }

    override fun delete(item: Airport): Airport {
        TODO("Not yet implemented")
    }


}