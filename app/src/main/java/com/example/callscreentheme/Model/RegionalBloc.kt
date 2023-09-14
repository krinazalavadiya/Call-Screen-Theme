package com.kinnu.country.Model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

class RegionalBloc {
    @SerializedName("acronym")
    @Expose
    var acronym: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("otherNames")
    @Expose
    var otherNames: List<String>? = null

    @SerializedName("otherAcronyms")
    @Expose
    var otherAcronyms: List<String>? = null
}