package com.buy.fly.data.entities

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import java.util.Currency


@MappedEntity
data class Country (
    val code: String,
    val name: String,
    val currency: String,
    val translation: String?
        ) {
    @Id
    @GeneratedValue
    var id: Long = 0
}