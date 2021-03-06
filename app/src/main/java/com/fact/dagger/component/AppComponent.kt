package com.fact.dagger.component

import android.app.Application
import com.fact.FactApplication
import com.fact.dagger.builder.AllActivityBuilder
import com.fact.dagger.module.AppModule
import com.fact.dagger.module.RetrofitModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


/**
 * Created by Lalit Khandelwal on 11, December, 2018.
 * lalitkhandelwal99@gmail.com
 */
@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, RetrofitModule::class, AllActivityBuilder::class])
interface AppComponent {

    fun inject(mApplication: FactApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun appBuilder(application: Application): Builder

        fun buildAppComponent(): AppComponent

    }
}

