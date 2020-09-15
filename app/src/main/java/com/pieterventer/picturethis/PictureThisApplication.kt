package com.pieterventer.picturethis

import android.app.Application
import com.pieterventer.picturethis.di.apiModule
import com.pieterventer.picturethis.di.repositoryModule
import com.pieterventer.picturethis.di.viewModelModule
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class PictureThisApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidContext(this@PictureThisApplication)
            modules(listOf(viewModelModule, apiModule, repositoryModule))
        }
    }
}