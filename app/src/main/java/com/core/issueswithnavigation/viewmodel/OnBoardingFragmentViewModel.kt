package com.core.issueswithnavigation.viewmodel

import com.core.issueswithnavigation.fragment.OnBoardingFragmentDirections
import com.library.core.BaseViewModel
import javax.inject.Inject

class OnBoardingFragmentViewModel @Inject constructor(): BaseViewModel() {

    private val directions = OnBoardingFragmentDirections.Companion

    override fun handleException(e: Throwable) {
        TODO("Not yet implemented")
    }

    fun next() {
        navigate(directions.actionNext())
    }

}