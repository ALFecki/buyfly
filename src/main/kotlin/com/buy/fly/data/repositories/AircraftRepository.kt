package com.buy.fly.data.repositories

import com.buy.fly.data.serde.MongoAircraft
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoCollection
import io.micronaut.context.annotation.Property


open class AircraftRepository(
    mongoClient: MongoClient,
    @Property(name = "aircraft.database") databaseName: String,
    @Property(name = "aircraft.collection") collectionName: String
) : IRepository<MongoAircraft> {
    override val collection: MongoCollection<MongoAircraft>
    override fun saveAll(entities: List<MongoAircraft>) {
        TODO("Not yet implemented")
    }

    override fun save(entity: MongoAircraft) {
        TODO("Not yet implemented")
    }


    init {
        val database = mongoClient.getDatabase(databaseName)
        collection = database.getCollection(collectionName, MongoAircraft::class.java)
    }
//    fun findByAirline(airline: Airline) : Aircraft?
//    fun findBySeats(seats_count: Int) : Aircraft?
}