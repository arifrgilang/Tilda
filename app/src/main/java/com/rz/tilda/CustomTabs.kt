package com.rz.tilda

import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.browser.customtabs.CustomTabsClient
import androidx.browser.customtabs.CustomTabsIntent
import androidx.browser.customtabs.CustomTabsServiceConnection
import androidx.browser.customtabs.CustomTabsSession
import androidx.core.content.ContextCompat

object CustomTabs{
    private const val CUSTOM_TAB_PACKAGE_NAME = "com.android.chrome"
    private var mClient: CustomTabsClient? = null
    private var mCustomTabsSession: CustomTabsSession? = null
    private lateinit var customTabsIntent: CustomTabsIntent

    private val mCustomTabsServiceConnection = object : CustomTabsServiceConnection() {
        override fun onCustomTabsServiceConnected(componentName: ComponentName, customTabsClient: CustomTabsClient) {
            //Pre-warming
            mClient = customTabsClient
            mClient!!.warmup(0L)
            mCustomTabsSession = mClient!!.newSession(null)
        }

        override fun onServiceDisconnected(name: ComponentName) {
            mClient = null
        }
    }

    @SuppressLint("PrivateResource")
    fun launch(activity: Context, url: String){
        CustomTabsClient.bindCustomTabsService(
            activity, CUSTOM_TAB_PACKAGE_NAME, mCustomTabsServiceConnection
        )

        customTabsIntent = CustomTabsIntent.Builder(mCustomTabsSession)
            .setToolbarColor(ContextCompat.getColor(activity, R.color.colorPrimary))
            .enableUrlBarHiding()
            .build()
        customTabsIntent.intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        customTabsIntent.launchUrl(activity, Uri.parse(url))
    }
}