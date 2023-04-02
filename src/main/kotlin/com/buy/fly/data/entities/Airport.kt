package com.buy.fly.data.entities

import com.buy.fly.data.IEntity
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity
data class Airport(
    override var alias: String,
    override var name: String,
    var country: String,
    var city: String
) : IEntity() {
    @Id
    @GeneratedValue
    override var id: Long = 0
}
