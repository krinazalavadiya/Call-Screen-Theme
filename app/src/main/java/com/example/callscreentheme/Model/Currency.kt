package com.kinnu.country.Model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class Currency {
    @SerializedName("code")
    @Expose
    var code: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("symbol")
    @Expose
    var symbol: String? = null
}