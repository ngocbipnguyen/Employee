package com.example.employee.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.employee.base.BaseFragment
import com.example.employee.databinding.AddEmployeeFragmentBinding
import com.example.employee.ui.viewModel.AddEmployeeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddEmployeeFragment : BaseFragment<AddEmployeeViewModel, AddEmployeeFragmentBinding>() {
    override fun createViewModel(): AddEmployeeViewModel {
        return ViewModelProvider(requireActivity()).get(AddEmployeeViewModel::class.java)
    }

    override fun inflateBinding(
        inflater: LayoutInflater?,
        container: ViewGroup?
    ): AddEmployeeFragmentBinding {
        return AddEmployeeFragmentBinding.inflate(inflater!!,container,false)
    }

    override fun initViews() {
    }

    override fun observeVM() {
    }
}