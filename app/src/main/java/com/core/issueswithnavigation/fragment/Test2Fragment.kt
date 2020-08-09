package com.core.issueswithnavigation.fragment

import com.core.issueswithnavigation.R
import com.core.issueswithnavigation.databinding.FragmentTest2Binding
import com.core.issueswithnavigation.databinding.FragmentTestBinding
import com.core.issueswithnavigation.viewmodel.Test2FragmentViewModel
import com.core.issueswithnavigation.viewmodel.TestFragmentViewModel
import com.library.core.BaseFragment
import com.library.core.lazyViewModel

class Test2Fragment : BaseFragment<FragmentTest2Binding, Test2FragmentViewModel>(R.layout.fragment_test2) {

    override val viewModel by lazyViewModel { Test2FragmentViewModel() }

    override fun setViewModelInBinding(binding: FragmentTest2Binding, viewModel: Test2FragmentViewModel) { }

}