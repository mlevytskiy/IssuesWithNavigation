package com.core.issueswithnavigation.fragment

import com.core.issueswithnavigation.R
import com.core.issueswithnavigation.databinding.FragmentTestBinding
import com.core.issueswithnavigation.viewmodel.TestFragmentViewModel
import com.library.core.BaseFragment
import com.library.core.lazyViewModel

class TestFragment : BaseFragment<FragmentTestBinding, TestFragmentViewModel>(R.layout.fragment_test) {

    override val viewModel by lazyViewModel { TestFragmentViewModel() }

    override fun setViewModelInBinding(binding: FragmentTestBinding, viewModel: TestFragmentViewModel) { }

}