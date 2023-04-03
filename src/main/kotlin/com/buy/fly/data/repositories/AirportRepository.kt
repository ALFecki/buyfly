package com.buy.fly.data.repositories

import com.buy.fly.data.serde.MongoAirport
import com.mongodb.client.model.Filters
import com.mongodb.reactivestreams.client.FindPublisher
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoCollection
import io.micronaut.context.annotation.Property


class AirportRepository(
    mongoClient: MongoClient,
    @Property(name = "airport.database") databaseName: String,
    @Property(name = "airport.collection") collectionName: String
) : IRepository<MongoAirport> {
    override val collection: MongoCollection<MongoAirport>
    init {
        val database = mongoClient.getDatabase(databaseName)
        collection = database.getCollection(collectionName, MongoAirport::class.java)
    }

    fun findByCountry(country: String) : FindPublisher<MongoAirport>? {
        return collection.find(Filters.eq("country", country))
    }
    fun findByCity(city: String) : FindPublisher<MongoAirport>? {
        return collection.find(Filters.eq("city", city))
    }
}