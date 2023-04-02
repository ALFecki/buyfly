package com.buy.fly.data.entities

import com.buy.fly.data.IEntity
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import java.util.Date

@MappedEntity
data class Flight(
    override var alias: String,
    override var name: String,

    val number: Long,
    val departure: Airport,
    val arrival: Airport,
    val date: Date,
//    val time: Time,
    val aircraft: Aircraft

) : IEntity() {
    @Id
    @GeneratedValue
    override var id: Long = 0
}
