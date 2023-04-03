package com.buy.fly.data.serde

import com.buy.fly.data.IEntity
import com.buy.fly.data.entities.Aircraft
import org.bson.codecs.pojo.annotations.BsonProperty
import com.buy.fly.data.entities.Airline

data class MongoAircraft(

    @field:BsonProperty("id") @param:BsonProperty("id") override var id: Long,
    @field:BsonProperty("alias") @param:BsonProperty("alias") override var alias: String,
    @field:BsonProperty("name") @param:BsonProperty("name") override var name: String,
    @field:BsonProperty("seats") @param:BsonProperty("seats") var seats: Int,
    @field:BsonProperty("airline") @param:BsonProperty("airline") var airline: Airline,
    ) : IEntity() {
        companion object {
            fun fromAircraft(aircraft: Aircraft) : MongoAircraft {
                return MongoAircraft(aircraft.id, aircraft.alias, aircraft.name, aircraft.seats, aircraft.airline)
            }

            fun toAircraft(mongoAircraft: MongoAircraft) : Aircraft {
                var aircraft = Aircraft(mongoAircraft.alias, mongoAircraft.name, mongoAircraft.seats, mongoAircraft.airline)
                aircraft.id = mongoAircraft.id
                return aircraft
            }
        }
}
