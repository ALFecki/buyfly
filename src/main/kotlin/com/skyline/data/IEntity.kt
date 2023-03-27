package com.skyline.data

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


abstract class IEntity {

    abstract var id: Long

    abstract var alias: String

    abstract var name: String

}