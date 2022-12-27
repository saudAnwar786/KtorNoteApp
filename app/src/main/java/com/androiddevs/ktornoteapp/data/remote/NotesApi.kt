package com.androiddevs.ktornoteapp.data.remote

import com.androiddevs.ktornoteapp.data.local.entities.Note
import com.androiddevs.ktornoteapp.data.remote.requests.AccountRequest
import com.androiddevs.ktornoteapp.data.remote.requests.AddOwnerRequest
import com.androiddevs.ktornoteapp.data.remote.requests.DeleteNoteRequest
import com.androiddevs.ktornoteapp.data.remote.responses.SimpleResponse
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface NotesApi {

    @POST("/register")
    suspend fun register( @Body accountRequest: AccountRequest): Response<SimpleResponse>

    @POST("/login")
    suspend fun login( @Body accountRequest: AccountRequest): Response<SimpleResponse>

    @POST("/addNote")
    suspend fun addNote(@Body note: Note):Response<ResponseBody>

    @POST("/deleteNote")
    suspend fun deleteNote(@Body deleteNoteRequest: DeleteNoteRequest):Response<ResponseBody>

    @POST("/addOwner")
    suspend fun addOwner(@Body addOwnerRequest: AddOwnerRequest):Response<SimpleResponse>

    @GET("/getNotes")
    suspend fun getAllNotes():Response<List<Note>>
}