package com.fact.view.splash

import android.content.Intent
import android.os.Bundle
import androidx.databinding.library.baseAdapters.BR
import com.fact.R
import com.fact.databinding.ActivitySplashBinding
import com.fact.navigator.ActivityNavigator
import com.fact.view.base.BaseActivity
import com.fact.viewmodel.SplashViewModel
import javax.inject.Inject

/**
 * Created by Lalit Khandelwal on 11, December, 2018.
 * lalitkhandelwal99@gmail.com
 */
class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>(),
    ActivityNavigator {
    override fun startActivity(activity: Class<*>) {
        val intent = Intent(this, activity)
        startActivity(intent)
        finish()
    }

    override val bindingVariable: Int
        get() = BR.viewModel
    override val layoutId: Int
        get() = R.layout.activity_splash
    override val viewModel: SplashViewModel
        get() = splashViewModel

    //Field injection
    @Inject
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashViewModel.navigator = this
    }

}
