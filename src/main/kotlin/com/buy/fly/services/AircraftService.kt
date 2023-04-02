package com.buy.fly.services

import com.buy.fly.data.entities.Aircraft
import com.buy.fly.data.serde.MongoAircraft
import jakarta.inject.Singleton


@Singleton
class AircraftService : IService<MongoAircraft, Aircraft> {
    override fun createItem(item: MongoAircraft): Aircraft {
        TODO("Not yet implemented")
    }

    override fun find(alias: String): Aircraft? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Aircraft>? {
        TODO("Not yet implemented")
    }

    override fun deleteAll(items: List<Aircraft>): List<Aircraft> {
        TODO("Not yet implemented")
    }

    override fun delete(item: Aircraft): Aircraft {
        TODO("Not yet implemented")
    }

    override fun insertAllItems(items: List<Aircraft>): List<Aircraft> {
        TODO("Not yet implemented")
    }

    override fun insertItem(item: Aircraft): Aircraft {
        TODO("Not yet implemented")
    }
}