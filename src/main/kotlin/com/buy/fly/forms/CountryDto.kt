package com.buy.fly.forms

import com.fasterxml.jackson.annotation.JsonProperty

data class CountryDto (
    @JsonProperty("code")
    val code : String,

    @JsonProperty("name")
    val name: String,

    @JsonProperty("currency")
    val currency: String,

    @JsonProperty("translations")
    val name_translations: Map<String, String>
    )