package com.example.fact.viewmodel

import com.example.fact.global.rxjava.SchedulerProvider
import com.example.fact.navigator.DefaultNavigator
import com.example.fact.view.base.BaseViewModel

/**
 * Created by Lalit Khandelwal on 11, December, 2018
 * lalitkhandelwal99@gmail.com
 */
class HomeViewModel(schedulerProvider: SchedulerProvider) : BaseViewModel<DefaultNavigator>(schedulerProvider)