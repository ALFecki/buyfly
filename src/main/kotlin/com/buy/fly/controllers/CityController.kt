package com.buy.fly.controllers

import com.buy.fly.data.entities.City
import com.buy.fly.services.CityService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable


@Controller("/cities")
class CityController (
    private val cityService: CityService
        ) {

    @Get("/")
    fun getAllCities() : List<City>? {
        return cityService.findAll()
    }

    @Get("/{name}")
    fun getCityByName(@PathVariable name : String) : City? {
        return cityService.find(name)
    }

}