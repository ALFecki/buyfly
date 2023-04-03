package com.buy.fly.controllers

import com.buy.fly.data.entities.City
import com.buy.fly.data.entities.Country
import com.buy.fly.forms.CityDto
import com.buy.fly.forms.CountryDto
import com.buy.fly.services.CityService
import com.buy.fly.services.CountryService
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse


object DbFakeConstants {
    var COUNTRIES : MutableList<Country> = mutableListOf()
    var CITIES : MutableList<City> = mutableListOf()
}

@Controller("/")
class AppController(
    private val countryService: CountryService,
    private val cityService: CityService
) {


    @Get("/load_data")
    fun loadData(): List<City> {
        val httpClient = HttpClient.newBuilder().build()
        val httpRequest =
            HttpRequest.newBuilder().uri(URI.create("http://api.travelpayouts.com/data/ru/countries.json")).build()
        val typeToken = object : TypeToken<List<CountryDto>>() {}.type
        val response = Gson().fromJson<List<CountryDto>>(
            httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString()).body(),
            typeToken
        )
        countryService.insertAllItems(response)
        val citiesRequest =
            HttpRequest.newBuilder().uri(URI.create("http://api.travelpayouts.com/data/ru/cities.json")).build()
        val typeTok = object : TypeToken<List<CityDto>>() {}.type
        val resp = Gson().fromJson<List<CityDto>>(
            httpClient.send(citiesRequest, HttpResponse.BodyHandlers.ofString()).body(),
            typeTok
        )
        cityService.insertAllItems(resp)
        return DbFakeConstants.CITIES
    }

    @Get("/update_data")
    fun updateData() {

    }
}