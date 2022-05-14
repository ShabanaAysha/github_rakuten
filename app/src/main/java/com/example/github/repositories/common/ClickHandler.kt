package com.example.github.repositories.common

import android.view.View

/**
 * This interface is used to handled click events throughout the application
 */
interface ClickHandler {
    fun onClick(view: View?,obj:Any?,position: Int?)
}