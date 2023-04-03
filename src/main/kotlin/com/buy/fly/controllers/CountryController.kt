package com.buy.fly.controllers


import com.buy.fly.data.entities.Country
import com.buy.fly.services.CountryService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.QueryValue

@Controller("/countries")
class CountryController (
    private val countryService: CountryService
) {

    @Get("/")
    fun getAllCountries() : List<Country>? {
        return countryService.findAll()
    }

    @Get("/{name}")
    fun getCountryByName(@PathVariable name : String) : Country? {
        return countryService.find(name)
    }

    @Get("/find")
    fun getCountryByCode(@QueryValue("code") code: String) : Country? {
        return countryService.findByCode(code)
    }

}