package com.buy.fly.data.serde

import com.buy.fly.data.IEntity
import com.buy.fly.data.entities.Aircraft
import com.buy.fly.data.entities.Airport
import com.buy.fly.data.entities.Flight
import org.bson.codecs.pojo.annotations.BsonProperty
import java.util.Date

data class MongoFlight(
    @field:BsonProperty("id") @param:BsonProperty("id") override var id: Long,
    @field:BsonProperty("alias") @param:BsonProperty("alias") override var alias: String,
    @field:BsonProperty("name") @param:BsonProperty("name") override var name: String,
    @field:BsonProperty("number") @param:BsonProperty("number") var number: Long,
    @field:BsonProperty("departure") @param:BsonProperty("departure") var departure: Airport,
    @field:BsonProperty("arrival") @param:BsonProperty("arrival") var arrival: Airport,
    @field:BsonProperty("date") @param:BsonProperty("date") var date: Date,
    @field:BsonProperty("aircraft") @param:BsonProperty("aircraft") var aircraft: Aircraft
) : IEntity() {
    companion object {
        fun fromAircraft(flight: Flight) : MongoFlight {
            return MongoFlight(flight.id, flight.alias, flight.name, flight.number, flight.departure, flight.arrival, flight.date, flight.aircraft)
        }

        fun toAircraft(mongoFlight: MongoFlight) : Flight {
            var flight = Flight(mongoFlight.alias, mongoFlight.name, mongoFlight.number, mongoFlight.departure, mongoFlight.arrival, mongoFlight.date, mongoFlight.aircraft)
            flight.id = mongoFlight.id
            return flight
        }
    }
}