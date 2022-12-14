package com.example.nearby.models

import androidx.room.TypeConverters
import com.example.nearby.data.database.converter.ConverterLocation
import java.io.Serializable

@TypeConverters(ConverterLocation::class)
class Geometry(

    var location: Location?

): Serializable