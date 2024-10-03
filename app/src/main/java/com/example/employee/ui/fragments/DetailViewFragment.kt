package com.example.employee.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.employee.base.BaseFragment
import com.example.employee.databinding.DetailFragmentBinding
import com.example.employee.ui.viewModel.DetailViewModel

class DetailViewFragment : BaseFragment<DetailViewModel, DetailFragmentBinding>() {
    override fun createViewModel(): DetailViewModel {
        return ViewModelProvider(requireActivity()).get(DetailViewModel::class.java)

    }

    override fun inflateBinding(
        inflater: LayoutInflater?,
        container: ViewGroup?
    ): DetailFragmentBinding {
        return DetailFragmentBinding.inflate(inflater!!,container,false)
    }

    override fun initViews() {
    }

    override fun observeVM() {
    }
}