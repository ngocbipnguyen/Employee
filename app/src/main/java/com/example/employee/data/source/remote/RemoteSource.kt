package com.example.employee.data.source.remote

import com.example.employee.data.model.Employee
import com.example.employee.data.source.AppDataSource
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import io.reactivex.android.schedulers.AndroidSchedulers;

class RemoteSource @Inject constructor (val apiInterface: ApiInterface) : AppDataSource.Remote {


    override fun getList(): Single<List<Employee>> {
        return apiInterface.getList().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread());
    }

    override fun getById(): Single<List<Employee>> {
        TODO("Not yet implemented")
    }

    override fun delete(): Single<List<Employee>> {
        TODO("Not yet implemented")
    }

    override fun create(): Single<List<Employee>> {
        TODO("Not yet implemented")
    }

    override fun update(): Single<List<Employee>> {
        TODO("Not yet implemented")
    }

    override fun changeAvatar(): Single<List<Employee>> {
        TODO("Not yet implemented")
    }
}