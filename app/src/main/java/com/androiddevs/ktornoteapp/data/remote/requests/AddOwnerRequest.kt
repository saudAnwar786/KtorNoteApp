package com.androiddevs.ktornoteapp.data.remote.requests

data class AddOwnerRequest(
    val noteId:String,
    val owner:String
)
