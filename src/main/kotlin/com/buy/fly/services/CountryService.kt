package com.buy.fly.services

import com.buy.fly.data.entities.Country
import com.buy.fly.forms.CountryDto
import jakarta.inject.Singleton

@Singleton
class CountryService : IService<CountryDto, Country> {
    override fun createItem(item: CountryDto): Country {
//        return MongoCountry.toCountry(item)
        TODO()
    }

    override fun find(alias: String): Country? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Country>? {
        TODO("Not yet implemented")
    }

    override fun insertItem(item: CountryDto): Country {
        TODO("Not yet implemented")
    }

    override fun deleteAll(items: List<Country>): List<Country> {
        TODO("Not yet implemented")
    }

    override fun delete(item: Country): Country {
        TODO("Not yet implemented")
    }

    override fun insertAllItems(items: List<CountryDto>): List<Country> {
        return parseItems(items)
    }

    private fun parseItems(items: List<CountryDto>) : List<Country> {
        val countryList = mutableListOf<Country>()
        for (node in items) {
            countryList.add(
                Country(
                    code = node.code,
                    name = node.name,
                    currency = node.currency,
                    translation = node.name_translations["en"]
                )
            )
        }
        return countryList
    }


}