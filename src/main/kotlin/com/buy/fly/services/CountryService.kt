package com.buy.fly.services

import com.buy.fly.controllers.DbFakeConstants
import com.buy.fly.data.entities.Country
import com.buy.fly.forms.CountryDto
import jakarta.inject.Singleton

@Singleton
class CountryService : IService<CountryDto, Country> {
    override fun createItem(item: CountryDto): Country {
        return Country(
            code = item.code,
            name = item.name,
            currency = item.currency,
            translation = item.name_translations["en"]
        )
    }

    override fun find(alias: String): Country? {
        return DbFakeConstants.COUNTRIES.find { it.name == alias }
    }

    fun findByCode(code: String): Country? {
        return DbFakeConstants.COUNTRIES.find { it.code == code }
    }

    override fun findAll(): List<Country>? {
        return DbFakeConstants.COUNTRIES
    }

    override fun insertItem(item: CountryDto): Country {
        val country = createItem(item)
        DbFakeConstants.COUNTRIES.add(country)
        return country
    }

    override fun deleteAll(items: List<Country>): List<Country> {
        DbFakeConstants.COUNTRIES.removeAll(items)
        return items
    }

    override fun delete(item: Country): Country {
        DbFakeConstants.COUNTRIES.remove(item)
        return item
    }

    override fun insertAllItems(items: List<CountryDto>): List<Country> {
        return parseItems(items)
    }

    private fun parseItems(items: List<CountryDto>) : List<Country> {
        val countryList = mutableListOf<Country>()
        for (node in items) {
            countryList.add(
                createItem(node)
            )
        }
        DbFakeConstants.COUNTRIES = countryList
        return countryList
    }


}