package dk.cphbusiness.template

import android.app.Activity
import android.app.Application
import android.os.Bundle

class App : Application() {

    companion object {
        lateinit var instance: App private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this;
    }
}
