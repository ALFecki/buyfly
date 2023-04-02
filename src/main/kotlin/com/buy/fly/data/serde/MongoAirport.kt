package com.buy.fly.data.serde

import com.buy.fly.data.IEntity
import com.buy.fly.data.entities.Airport
import org.bson.codecs.pojo.annotations.BsonProperty

data class MongoAirport(
    @field:BsonProperty("id") @param:BsonProperty("id") override var id: Long,
    @field:BsonProperty("alias") @param:BsonProperty("alias") override var alias: String,
    @field:BsonProperty("name") @param:BsonProperty("name") override var name: String,
    @field:BsonProperty("country") @param:BsonProperty("country") var country: String,
    @field:BsonProperty("city") @param:BsonProperty("city") var city: String
) : IEntity() {
    companion object {
        fun fromAircraft(airport: Airport) : MongoAirport {
            return MongoAirport(airport.id, airport.alias, airport.name, airport.country, airport.city)
        }

        fun toAircraft(mongoAirport: MongoAirport) : Airport {
            var airport = Airport(mongoAirport.alias, mongoAirport.name, mongoAirport.country, mongoAirport.city)
            airport.id = mongoAirport.id
            return airport
        }
    }
}