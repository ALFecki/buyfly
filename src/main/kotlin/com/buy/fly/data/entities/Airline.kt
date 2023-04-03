package com.buy.fly.data.entities

import com.buy.fly.data.IEntity
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity


@MappedEntity
data class Airline (

    override var name: String,
    override var alias: String

    ) : IEntity() {

    @Id
    @GeneratedValue
    override var id: Long = 0
}
