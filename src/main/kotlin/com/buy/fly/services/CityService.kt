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
        TODO("Not yet implemented")
    }

    override fun find(alias: String): City? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<City>? {
        TODO("Not yet implemented")
    }

    override fun deleteAll(items: List<City>): List<City> {
        TODO("Not yet implemented")
    }

    override fun delete(item: City): City {
        TODO("Not yet implemented")
    }

    override fun insertAllItems(items: List<CityDto>): List<City> {
        val cityList = mutableListOf<City>()
//        println(items)
        for (city in items) {
            val country = DbFakeConstants.COUNTRIES.find { it.code == city.country_code }
//            if (country != null) {
//                println(country)
//            }
            cityList.add(
                City(
                    code = city.code,
                    name = city.name,
                    country = country,
                    translation = city.name_translations["en"]
                )
            )
        }
        return cityList
    }

    override fun insertItem(item: CityDto): City {
        TODO("Not yet implemented")
    }

}