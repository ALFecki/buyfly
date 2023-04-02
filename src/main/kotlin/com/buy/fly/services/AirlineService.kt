package com.buy.fly.services

import com.buy.fly.data.entities.Airline
import com.buy.fly.data.serde.MongoAirline
import jakarta.inject.Singleton


@Singleton
class AirlineService : IService<MongoAirline, Airline> {
    override fun createItem(item: MongoAirline): Airline {
        TODO("Not yet implemented")
    }

    override fun find(alias: String): Airline? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Airline>? {
        TODO("Not yet implemented")
    }

    override fun deleteAll(items: List<Airline>): List<Airline> {
        TODO("Not yet implemented")
    }

    override fun delete(item: Airline): Airline {
        TODO("Not yet implemented")
    }

    override fun insertAllItems(items: List<Airline>): List<Airline> {
        TODO("Not yet implemented")
    }

    override fun insertItem(item: Airline): Airline {
        TODO("Not yet implemented")
    }

}