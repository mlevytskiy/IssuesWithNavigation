package com.core.issueswithnavigation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.core.issueswithnavigation.fragment.OnBoarding2FragmentDirections
import com.core.issueswithnavigation.fragment.OnBoardingFragmentDirections
import com.library.core.BaseViewModel
import javax.inject.Inject

class OnBoarding2FragmentViewModel @Inject constructor(): BaseViewModel() {

    private val directions = OnBoarding2FragmentDirections.Companion

    private val onBoardingResultMutable = MutableLiveData<Boolean>()
    val onBoardingResult: LiveData<Boolean> = onBoardingResultMutable

    override fun handleException(e: Throwable) {
        TODO("Not yet implemented")
    }

    fun success() {
        onBoardingResultMutable.value = true
    }

    fun fail() {
        onBoardingResultMutable.value = false
    }

    fun exitOnBoarding() {
        navigate(directions.actionExitOnBoarding())
    }

}