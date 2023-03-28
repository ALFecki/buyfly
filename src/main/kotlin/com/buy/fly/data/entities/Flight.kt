package com.buy.fly.data.entities

import com.buy.fly.data.IEntity
import java.util.Date
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Flight(
    override var alias: String,
    override var name: String,

    val number: Long,
    val departure: Airport,
    val arrival: Airport,
    val date: Date,
    val aircraft: Aircraft

) : IEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override var id: Long = 0
}
