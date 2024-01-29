package com.example.mylibrary

import android.app.Activity
import android.content.Context
import android.widget.Toast
import com.example.mylibrary.ShowToast.Companion.ShowToast


class ShowToast {

    fun Context.ShowToast(msz: String) {
        Toast.makeText(this, msz, Toast.LENGTH_LONG).show()
    }
    companion object {


        @JvmStatic
        fun Activity.ShowToast(msz: String) {
            Toast.makeText(this, msz, Toast.LENGTH_LONG).show()
        }
    }

}