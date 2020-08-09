package com.core.issueswithnavigation.viewmodel

import com.core.issueswithnavigation.fragment.HomeFragmentDirections
import com.library.core.BaseViewModel
import javax.inject.Inject

class HomeFragmentViewModel @Inject constructor(): BaseViewModel() {

    private val directions = HomeFragmentDirections.Companion

    override fun handleException(e: Throwable) {
        TODO("Not yet implemented")
    }

    fun navToOnBoarding() {
        navigate(directions.actionHomeToOnBoarding())
    }

    fun navToTest() {
        navigate(directions.actionHomeToTest())
    }

    fun navToTest2() {
        navigate(directions.actionHomeToTest1())
    }

}