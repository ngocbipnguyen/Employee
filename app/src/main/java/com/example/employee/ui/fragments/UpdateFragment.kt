package com.example.employee.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.employee.base.BaseFragment
import com.example.employee.databinding.UpdateFragmentBinding
import com.example.employee.ui.viewModel.UpdateVIewModel

class UpdateFragment : BaseFragment<UpdateVIewModel, UpdateFragmentBinding>() {
    override fun createViewModel(): UpdateVIewModel {
        return ViewModelProvider(requireActivity()).get(UpdateVIewModel::class.java)

    }

    override fun inflateBinding(
        inflater: LayoutInflater?,
        container: ViewGroup?
    ): UpdateFragmentBinding {
        return UpdateFragmentBinding.inflate(inflater!!,container,false)
    }

    override fun initViews() {
    }

    override fun observeVM() {
    }
}