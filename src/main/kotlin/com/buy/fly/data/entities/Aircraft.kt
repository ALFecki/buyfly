package com.buy.fly.data.entities

import com.buy.fly.data.IEntity
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity
data class Aircraft(

    override var name: String,
    override var alias: String,
    var seats: Int,
    var airline: Airline

    ) : IEntity() {
    @Id
    @GeneratedValue
    override var id: Long = 0
}
