package com.kinnu.country.Model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Flags {
    @SerializedName("svg")
    @Expose
    var svg: String? = null

    @SerializedName("png")
    @Expose
    var png: String? = null
}