package com.example.employee.data.source

import com.example.employee.data.model.Employee
import io.reactivex.Single
import retrofit2.http.GET

interface AppDataSource {

    interface Remote {

        fun getList(): Single<List<Employee>>

        fun getById(): Single<List<Employee>>

        fun delete(): Single<List<Employee>>

        fun create(): Single<List<Employee>>

        fun update(): Single<List<Employee>>

        fun changeAvatar(): Single<List<Employee>>


    }

}