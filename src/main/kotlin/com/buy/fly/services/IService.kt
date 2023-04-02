package com.buy.fly.services

interface IService<T> {
    fun createItem(item: T) : T
    fun find(alias: String) : T?
    fun findAll() : List<T>?
    fun insertItem(item: T) : T
    fun insertAllItems(items: List<T>) : List<T>
    fun delete(item: T) : T
    fun deleteAll(items: List<T>): List<T>
}