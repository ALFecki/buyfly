package com.buy.fly.services

import com.buy.fly.data.roles.Customer
import com.fasterxml.jackson.annotation.JsonValue
import org.bson.json.JsonObject

class CustomerService: IService<JsonObject, Customer> {
    override fun createItem(item: JsonObject): Customer {
        TODO("Not yet implemented")
    }

    override fun find(alias: String): Customer? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Customer>? {
        TODO("Not yet implemented")
    }

    override fun insertAllItems(items: List<JsonObject>): List<Customer> {
        TODO("Not yet implemented")
    }

    override fun insertItem(item: JsonObject): Customer {
        TODO("Not yet implemented")
    }

    override fun deleteAll(items: List<Customer>): List<Customer> {
        TODO("Not yet implemented")
    }

    override fun delete(item: Customer): Customer {
        TODO("Not yet implemented")
    }


}