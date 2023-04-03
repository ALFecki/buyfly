package com.buy.fly.data.repositories

import com.buy.fly.data.serde.MongoAirport
import com.buy.fly.data.serde.MongoCountry
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoCollection
import io.micronaut.context.annotation.Property

class CountryRepository(
    mongoClient: MongoClient,
    @Property(name = "country.database") databaseName: String,
    @Property(name = "country.collection") collectionName: String
) : IRepository<MongoCountry> {
    override val collection: MongoCollection<MongoCountry>

    init {
        val database = mongoClient.getDatabase(databaseName)
        collection = database.getCollection(collectionName, MongoCountry::class.java)
    }
}