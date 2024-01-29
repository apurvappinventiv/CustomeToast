package com.example.demolib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demolib.ShowToast.Companion.ShowToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun showToast(msz : String){
      ShowToast(msz)
    }
}