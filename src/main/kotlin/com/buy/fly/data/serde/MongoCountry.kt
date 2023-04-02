package com.buy.fly.data.serde

import com.buy.fly.data.IEntity
import com.buy.fly.data.entities.Airport
import com.buy.fly.data.entities.Country
import org.bson.codecs.pojo.annotations.BsonProperty
import java.util.Currency

data class MongoCountry(
    @field:BsonProperty("id") @param:BsonProperty("id") var id: Long,
    @field:BsonProperty("code") @param:BsonProperty("code") var code: String,
    @field:BsonProperty("name") @param:BsonProperty("name") var name: String,
    @field:BsonProperty("currency") @param:BsonProperty("currency") var currency: String,
    @field:BsonProperty("translation") @param:BsonProperty("translation") var translation: String?
) {
    companion object {
        fun fromCountry(country: Country): MongoCountry {
            return MongoCountry(
                country.id,
                code = country.code,
                name = country.name,
                currency = country.currency,
                translation = country.translation
            )
        }

        fun toCountry(mongoCountry: MongoCountry): Country {
            var country = Country(
                code = mongoCountry.code,
                name = mongoCountry.name,
                currency = mongoCountry.currency,
                translation = mongoCountry.translation
            )
            country.id = mongoCountry.id
            return country
        }
    }
}