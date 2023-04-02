package com.buy.fly.data.repositories

import com.buy.fly.data.entities.Airport
import io.micronaut.data.annotation.Repository
import io.micronaut.data.mongodb.annotation.MongoRepository


//@MongoRepository
interface AirportRepository : IUpdateRepository<Airport> {
    fun findByCity(city: String) : Airport?
    fun findByCountry(country: String) : Airport?


}