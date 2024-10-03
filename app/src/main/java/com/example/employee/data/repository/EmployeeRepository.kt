package com.example.employee.data.repository

import com.example.employee.data.model.Employee
import com.example.employee.data.source.remote.RemoteSource
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class EmployeeRepository @Inject constructor(val remoteSource: RemoteSource) {


    fun getList(): Single<List<Employee>> {
        return remoteSource.getList();
    }

}