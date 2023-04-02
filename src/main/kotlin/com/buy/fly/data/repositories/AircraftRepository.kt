package com.buy.fly.data.repositories

import com.buy.fly.data.entities.Airline
import com.buy.fly.data.serde.MongoAircraft
import com.mongodb.client.model.Filters.eq
import com.mongodb.reactivestreams.client.FindPublisher
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoCollection
import io.micronaut.context.annotation.Property


class AircraftRepository(
    mongoClient: MongoClient,
    @Property(name = "aircraft.database") databaseName: String,
    @Property(name = "aircraft.collection") collectionName: String
) : IRepository<MongoAircraft> {
    override val collection: MongoCollection<MongoAircraft>
    init {
        val database = mongoClient.getDatabase(databaseName)
        collection = database.getCollection(collectionName, MongoAircraft::class.java)
    }

    fun findByAirline(airline: Airline) : FindPublisher<MongoAircraft>? {
        return collection.find(eq("airline", airline))
    }
    fun findBySeats(seats_count: Int) : FindPublisher<MongoAircraft>? {
        return collection.find(eq("seats", seats_count))
    }
}