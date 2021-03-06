package com.sudipta.cleanarchdemo.presentation.model

import com.google.gson.annotations.SerializedName

data class PostUI(
    @SerializedName("id") val id: Long,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String
)
