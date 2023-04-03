package com.buy.fly.services

import com.buy.fly.controllers.DbFakeConstants
import com.buy.fly.data.entities.City
import com.buy.fly.data.entities.Country
import com.buy.fly.data.repositories.CityRepository
import com.buy.fly.forms.CityDto
import jakarta.inject.Singleton


@Singleton
class CityService(
//    private val cityRepository: CityRepository
) : IService<CityDto, City> {
    override fun createItem(item: CityDto): City {
        val country = DbFakeConstants.COUNTRIES.find { it.code == item.country_code }
        return City(
            code = item.code,
            name = item.name,
            country = country,
            translation = item.name_translations["en"]
        )
    }

    override fun find(alias: String): City? {
        return DbFakeConstants.CITIES.find { it.name == alias }
    }

    override fun findAll(): List<City>? {
        return DbFakeConstants.CITIES
    }

    override fun deleteAll(items: List<City>): List<City> {
        DbFakeConstants.CITIES.removeAll(items)
        return items
    }

    override fun delete(item: City): City {
        DbFakeConstants.CITIES.remove(item)
        return item
    }

    override fun insertAllItems(items: List<CityDto>): List<City> {
        val cityList = mutableListOf<City>()
//        println(items)
        for (city in items) {
            cityList.add(
                createItem(city)
            )
        }
        DbFakeConstants.CITIES = cityList
        return cityList
    }

    override fun insertItem(item: CityDto): City {
        val city =  createItem(item)
        DbFakeConstants.CITIES.add(city)
        return city
    }

}