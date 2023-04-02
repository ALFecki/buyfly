package com.buy.fly.data.serde

import com.buy.fly.data.IEntity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Airport(
    override var alias: String,
    override var name: String,
    var country: String,
    var city: String
) : IEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override var id: Long = 0
}
