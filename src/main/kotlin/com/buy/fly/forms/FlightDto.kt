package com.buy.fly.forms

import com.buy.fly.data.entities.Aircraft
import com.buy.fly.data.entities.Airport
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class FlightDto (
    @JsonProperty("number")
    val number: Long,

    @JsonProperty("departure")
    val departure: Airport,

    @JsonProperty("arrival")
    val arrival: Airport,

    @JsonProperty("date")
    val date: Date,

    @JsonProperty("aircraft")
    val aircraft: Aircraft
    )