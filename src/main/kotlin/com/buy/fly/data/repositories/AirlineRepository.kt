package com.buy.fly.data.repositories

import com.buy.fly.data.entities.Airline
import com.buy.fly.data.serde.MongoAircraft
import com.buy.fly.data.serde.MongoAirline
import com.mongodb.client.model.Filters
import com.mongodb.client.model.Filters.eq
import com.mongodb.reactivestreams.client.FindPublisher
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoCollection
import io.micronaut.context.annotation.Property
import io.micronaut.data.repository.CrudRepository

//@MongoRepository
class AirlineRepository(
    mongoClient: MongoClient,
    @Property(name = "airline.database") databaseName: String,
    @Property(name = "airline.collection") collectionName: String
) : IRepository<MongoAirline> {
    override val collection: MongoCollection<MongoAirline>
    init {
        val database = mongoClient.getDatabase(databaseName)
        collection = database.getCollection(collectionName, MongoAirline::class.java)
    }
}