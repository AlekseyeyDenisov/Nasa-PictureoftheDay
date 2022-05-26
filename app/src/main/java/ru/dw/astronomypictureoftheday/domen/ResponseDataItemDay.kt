package ru.dw.astronomypictureoftheday.domen

import com.google.gson.annotations.SerializedName

data class ResponseDataItemDay(

    val date: String,
    val copyright: String,
    @field:SerializedName("media_type")
    val mediaType: String,
    @field:SerializedName("hdurl")
    val hdUrl: String,
    @field:SerializedName("service_version")
    val serviceVersion: String,
    val explanation: String,
    val title: String,
    val url: String
)