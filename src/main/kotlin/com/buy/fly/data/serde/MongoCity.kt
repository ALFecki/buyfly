package com.buy.fly.data.serde

import com.buy.fly.data.entities.City
import com.buy.fly.data.entities.Country
import com.buy.fly.data.repositories.CityRepository
import org.bson.codecs.pojo.annotations.BsonProperty

data class MongoCity(
    @field:BsonProperty("id") @param:BsonProperty("id") var id: Long,
    @field:BsonProperty("code") @param:BsonProperty("code") var code: String,
    @field:BsonProperty("name") @param:BsonProperty("name") var name: String?,
    @field:BsonProperty("currency") @param:BsonProperty("currency") var country: Country?,
    @field:BsonProperty("translation") @param:BsonProperty("translation") var translation: String?
) {
    companion object {
        fun fromCity(city: City): MongoCity {
            return MongoCity(
                city.id,
                code = city.code,
                name = city.name,
                country = city.country,
                translation = city.translation
            )
        }

        fun toCity(city: MongoCity): City {
            val country = City(
                code = city.code,
                name = city.name,
                country = city.country,
                translation = city.translation
            )
            country.id = city.id
            return country
        }
    }
}