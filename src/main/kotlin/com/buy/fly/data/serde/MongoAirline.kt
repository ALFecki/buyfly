package com.buy.fly.data.serde

import com.buy.fly.data.IEntity
import com.buy.fly.data.entities.Airline
import org.bson.codecs.pojo.annotations.BsonProperty

data class MongoAirline(
    @field:BsonProperty("id") @param:BsonProperty("id") override var id: Long,
    @field:BsonProperty("alias") @param:BsonProperty("alias") override var alias: String,
    @field:BsonProperty("name") @param:BsonProperty("name") override var name: String,
) : IEntity() {
    companion object {
        fun fromAirline(airline: Airline) : MongoAirline {
            return MongoAirline(airline.id, airline.alias, airline.name)
        }

        fun toAirline(mongoAirline: MongoAirline) : Airline {
            var airline = Airline(mongoAirline.alias, mongoAirline.name)
            airline.id = mongoAirline.id
            return airline
        }
    }
}