package com.buy.fly.data.repositories

import com.buy.fly.data.entities.Airline
import io.micronaut.data.annotation.Repository
import io.micronaut.data.mongodb.annotation.MongoRepository

//@MongoRepository
interface AirlineRepository : IUpdateRepository<Airline> {

}