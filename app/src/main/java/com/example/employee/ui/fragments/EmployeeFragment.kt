package com.example.employee.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.employee.base.BaseFragment
import com.example.employee.databinding.EmployeeFragmentBinding
import com.example.employee.ui.viewModel.EmployeeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EmployeeFragment : BaseFragment<EmployeeViewModel, EmployeeFragmentBinding>() {
    override fun createViewModel(): EmployeeViewModel {
        return ViewModelProvider(requireActivity()).get(EmployeeViewModel::class.java)

    }

    override fun inflateBinding(
        inflater: LayoutInflater?,
        container: ViewGroup?
    ): EmployeeFragmentBinding {
        return EmployeeFragmentBinding.inflate(inflater!!,container,false)
    }

    override fun initViews() {
    }

    override fun observeVM() {
    }
}