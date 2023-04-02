package com.buy.fly.data.repositories


//@MongoRepository
interface IUpdateRepository<T> : IRepository<T> {
    fun updateByAlias(alias: String, entity: T)

}