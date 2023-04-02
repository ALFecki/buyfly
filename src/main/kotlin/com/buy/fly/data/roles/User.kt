package com.buy.fly.data.roles

abstract class User {
    abstract val userId: Long
    abstract val login: String
    abstract val email: String
}