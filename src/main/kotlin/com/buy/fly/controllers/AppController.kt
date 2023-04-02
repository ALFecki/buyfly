package com.buy.fly.controllers

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import jakarta.inject.Inject
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse


@Controller("/")
class AppController {


    @Get("/load_data")
    fun loadData() {
        val httpClient = HttpClient.newBuilder().build()
        val httpRequest =
            HttpRequest.newBuilder().uri(URI.create("http://api.travelpayouts.com/data/ru/countries.json")).build()

    }

    @Get("/update_data")
    fun updateData() {

    }
}