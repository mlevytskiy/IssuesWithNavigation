package com.core.issueswithnavigation.fragment

import android.os.Bundle
import android.view.View
import com.core.issueswithnavigation.MainActivity
import com.core.issueswithnavigation.R
import com.core.issueswithnavigation.databinding.FragmentHomeBinding
import com.core.issueswithnavigation.viewmodel.HomeFragmentViewModel
import com.library.core.BaseFragment
import com.library.core.lazyViewModel

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeFragmentViewModel>(R.layout.fragment_home) {

    override val viewModel by lazyViewModel { HomeFragmentViewModel() }

    override fun setViewModelInBinding(binding: FragmentHomeBinding, viewModel: HomeFragmentViewModel) {
        binding.viewModel = viewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val act = requireActivity() as MainActivity
        if (!act.hasOnBoardingResult) {
            return
        }
        viewModel.withDelay = true
        if (act.onBoardingResult) {
            viewModel.navToTest()
        } else {
            viewModel.navToTest2()
        }
    }

}