package com.saifkhan.completeappdemo.Ui.fragments.homeFragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class HomeViewModelFactory:ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HomeFragmentViewModel(


        )as T
    }
}