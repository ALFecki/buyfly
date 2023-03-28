package com.buy.fly.data.entities

import com.buy.fly.data.IEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
data class Airline (

    override var name: String,
    override var alias: String

    ) : IEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override var id: Long = 0
}
