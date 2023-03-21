package com.example.pil_app_hello_word.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pil_app_hello_word.mvp.presenter.MainPresenter
import com.example.pil_app_hello_word.mvp.view.MainView

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MainPresenter(MainView(this))
    }
}