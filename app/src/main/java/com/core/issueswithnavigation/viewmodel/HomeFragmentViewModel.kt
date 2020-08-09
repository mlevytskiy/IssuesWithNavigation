package com.core.issueswithnavigation.viewmodel

import com.core.issueswithnavigation.fragment.HomeFragmentDirections
import com.library.core.BaseViewModel
import kotlinx.coroutines.delay
import javax.inject.Inject

class HomeFragmentViewModel @Inject constructor(): BaseViewModel() {

    private val directions = HomeFragmentDirections.Companion
    var withDelay: Boolean = false

    override fun handleException(e: Throwable) {
        TODO("Not yet implemented")
    }

    fun navToOnBoarding() {
        navigate(directions.actionHomeToOnBoarding())
    }

    fun navToTest() {
        if (!withDelay) {
            navigate(directions.actionHomeToTest())
            return
        }

        startBgJob {
            delay(500)
            navigate(directions.actionHomeToTest())
        }

    }

    fun navToTest2() {
        if (!withDelay) {
            navigate(directions.actionHomeToTest1())
            return
        }

        startBgJob {
            delay(500)
            navigate(directions.actionHomeToTest1())
        }
    }

}