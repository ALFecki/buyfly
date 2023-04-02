package com.buy.fly.data.entities

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity


@MappedEntity
data class City(

    val code: String,
    val name: String?,
    val country: Country?,
    val translation: String?
) {
    @Id
    @GeneratedValue
    var id: Long = 0
}