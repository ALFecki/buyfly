package com.buy.fly.data.serde

import org.bson.codecs.pojo.annotations.BsonProperty

data class ISerde (
    @field:BsonProperty("id") @param:BsonProperty("id") var id: Long,
    @field:BsonProperty("alias") @param:BsonProperty("alias") var alias: String,
    @field:BsonProperty("name") @param:BsonProperty("name") var name: String,
) {}