package com.buy.fly.data.repositories

import com.buy.fly.data.serde.MongoCity
import com.buy.fly.data.serde.MongoCountry
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoCollection
import io.micronaut.context.annotation.Property
import io.micronaut.data.annotation.Repository


class CityRepository(
    mongoClient: MongoClient,
    @Property(name = "city.database") databaseName: String,
    @Property(name = "city.collection") collectionName: String
) : IRepository<MongoCity> {
    override val collection: MongoCollection<MongoCity>

    init {
        val database = mongoClient.getDatabase(databaseName)
        collection = database.getCollection(collectionName, MongoCity::class.java)
    }
}