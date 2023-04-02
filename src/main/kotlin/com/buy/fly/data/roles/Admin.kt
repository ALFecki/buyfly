package com.buy.fly.data.roles

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity


@MappedEntity
data class Admin(

     override val login: String,
     override val email: String

) : User() {
    @Id
    @GeneratedValue
    override val userId: Long = 0
}
