package com.core.issueswithnavigation.fragment

import com.core.issueswithnavigation.MainActivity
import com.core.issueswithnavigation.R
import com.core.issueswithnavigation.databinding.FragmentOnBoarding2Binding
import com.core.issueswithnavigation.databinding.FragmentOnBoardingBinding
import com.core.issueswithnavigation.databinding.FragmentTestBinding
import com.core.issueswithnavigation.viewmodel.OnBoarding2FragmentViewModel
import com.core.issueswithnavigation.viewmodel.OnBoardingFragmentViewModel
import com.core.issueswithnavigation.viewmodel.TestFragmentViewModel
import com.library.core.BaseFragment
import com.library.core.lazyViewModel

class OnBoarding2Fragment : BaseFragment<FragmentOnBoarding2Binding, OnBoarding2FragmentViewModel>(R.layout.fragment_on_boarding2) {

    override val viewModel by lazyViewModel { OnBoarding2FragmentViewModel() }

    override fun setViewModelInBinding(binding: FragmentOnBoarding2Binding, viewModel: OnBoarding2FragmentViewModel) {
        binding.viewModel = viewModel
        observeEvent(viewModel.onBoardingResult) {
            val activity = requireActivity() as MainActivity
            activity.onBoardingResult = it
            activity.hasOnBoardingResult = true
            viewModel.exitOnBoarding()
        }
    }

}