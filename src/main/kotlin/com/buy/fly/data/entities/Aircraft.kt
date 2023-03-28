package com.buy.fly.data.entities

import com.buy.fly.data.IEntity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Aircraft(

    override var name: String,
    override var alias: String,
    var seats: Int,
    var airline: Airline

    ) : IEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override var id: Long = 0
}
