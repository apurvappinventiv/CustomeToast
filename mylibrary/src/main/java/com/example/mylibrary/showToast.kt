package com.example.mylibrary

import android.app.Activity
import android.content.Context
import android.widget.Toast


class ShowToast {

    companion object {
        @JvmStatic
        fun Context.ShowToast(msz: String) {
            Toast.makeText(this, msz, Toast.LENGTH_LONG).show()
        }

        @JvmStatic
        fun Activity.ShowToast(msz: String) {
            Toast.makeText(this, msz, Toast.LENGTH_LONG).show()
        }
    }

}