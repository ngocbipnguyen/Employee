package com.example.employee.data.source.remote

import com.example.employee.data.model.Employee
import io.reactivex.Single
import retrofit2.http.GET

interface ApiInterface {

    @GET("Getlist")
    fun getList(): Single<List<Employee>>

    @GET("GetById")
    fun getById(): Single<List<Employee>>

    @GET("Delete")
    fun delete(): Single<List<Employee>>

    @GET("Create")
    fun create(): Single<List<Employee>>

    @GET("Update")
    fun update(): Single<List<Employee>>

    @GET("ChangeAvatar")
    fun changeAvatar(): Single<List<Employee>>

}