package com.buy.fly.forms

import com.fasterxml.jackson.annotation.JsonProperty

data class CityDto (
    @JsonProperty("country_code")
    val country_code: String,

    @JsonProperty("code")
    val code: String,

    @JsonProperty("name")
    val name: String,

    @JsonProperty("translations")
    val name_translations: Map<String, String>

    )