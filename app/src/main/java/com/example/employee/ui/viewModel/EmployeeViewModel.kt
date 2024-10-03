package com.example.employee.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.employee.base.BaseViewModel
import com.example.employee.data.model.Employee
import com.example.employee.data.repository.EmployeeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.SingleOnSubscribe
import io.reactivex.SingleSource
import io.reactivex.internal.operators.single.SingleSubscribeOn
import javax.inject.Inject

@HiltViewModel
class EmployeeViewModel @Inject constructor(employeeRepository: EmployeeRepository,
                                            source: SingleSource<out List<Employee>>?
) : BaseViewModel() {


    private var _employees = MutableLiveData<List<Employee>>()
    val employees = _employees

    init {
        employeeRepository.getList().subscribe()
    }

}