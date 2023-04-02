package com.buy.fly.data.repositories

import com.mongodb.client.model.Filters.eq
import com.mongodb.client.result.DeleteResult
import com.mongodb.reactivestreams.client.FindPublisher
import com.mongodb.reactivestreams.client.MongoCollection
import org.reactivestreams.Publisher


interface IRepository<T> {
    val collection: MongoCollection<T>

    fun findAll(): FindPublisher<T> {
        return collection.find()
    }

    fun findByAlias(alias: String): Publisher<T>? {
        return collection.find(eq("alias", alias)).first()
    }
    fun deleteByAlias(alias: String) : Publisher<DeleteResult>? {
        return collection.deleteOne(eq("alias", alias))
    }

    fun save(entity: T)
    fun saveAll(entities: List<T>)

}