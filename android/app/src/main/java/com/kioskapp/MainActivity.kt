package com.kioskapp

import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.fabricEnabled
import com.facebook.react.defaults.DefaultReactActivityDelegate
import android.os.Bundle
import android.util.Log

import android.view.WindowInsets
import android.view.WindowInsetsController

class MainActivity : ReactActivity() {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  override fun getMainComponentName(): String = "KioskApp"

  /**
   * Returns the instance of the [ReactActivityDelegate]. We use [DefaultReactActivityDelegate]
   * which allows you to enable New Architecture with a single boolean flags [fabricEnabled]
   */
  override fun createReactActivityDelegate(): ReactActivityDelegate =
      DefaultReactActivityDelegate(this, mainComponentName, fabricEnabled)

      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Other initializations if necessary

        // Call startLockTask to enter lock task mode
        try {
        startLockTask()
        hideSystemBars()
        } catch (e: Exception) {
          // Handle exception or log for debugging
          Log.e("LockTask", "Error starting lock task mode", e)
        }
    }

    private fun hideSystemBars() {
        val windowInsetsController = window.insetsController
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets.Type.systemBars())
            windowInsetsController.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    }
}
