package com.example.nearby.models

import com.google.gson.annotations.Expose
import java.io.Serializable

class Results(

    @Expose
    var results: List<Places>? = ArrayList()

): Serializable