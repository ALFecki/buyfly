package com.buy.fly.data.repositories

import com.mongodb.client.model.Filters.eq
import com.mongodb.reactivestreams.client.MongoCollection


//@MongoRepository
interface IUpdateRepository<T> : IRepository<T> {
//    fun updateByAlias(alias: String, entity: T) {
//        collection.updateOne(eq("alias", alias))
//    }

}