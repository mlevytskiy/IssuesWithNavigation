package com.core.issueswithnavigation.fragment

import com.core.issueswithnavigation.R
import com.core.issueswithnavigation.databinding.FragmentOnBoardingBinding
import com.core.issueswithnavigation.databinding.FragmentTestBinding
import com.core.issueswithnavigation.viewmodel.OnBoardingFragmentViewModel
import com.core.issueswithnavigation.viewmodel.TestFragmentViewModel
import com.library.core.BaseFragment
import com.library.core.lazyViewModel

class OnBoardingFragment : BaseFragment<FragmentOnBoardingBinding, OnBoardingFragmentViewModel>(R.layout.fragment_on_boarding) {

    override val viewModel by lazyViewModel { OnBoardingFragmentViewModel() }

    override fun setViewModelInBinding(binding: FragmentOnBoardingBinding, viewModel: OnBoardingFragmentViewModel) {
        binding.viewModel = viewModel
    }

}