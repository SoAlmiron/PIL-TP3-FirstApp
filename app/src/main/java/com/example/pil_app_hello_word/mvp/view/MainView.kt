package com.example.pil_app_hello_word.mvp.view

import android.app.Activity
import android.widget.Toast
import com.example.pil_app_hello_word.R
import com.example.pil_app_hello_word.databinding.ActivityMainBinding
import com.example.pil_app_hello_word.mvp.contract.MainContract

class MainView(private var activity: Activity) : MainContract.View {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)
    init {
        activity.setContentView(binding.root)
    }

    override fun getTextInput(): String {
        return binding.textView.text.toString()
    }

    override fun showError() {
        Toast.makeText(
            activity,
            activity.resources.getString(R.string.message_error),
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun showText(text: String) {
        Toast.makeText(activity, text, Toast.LENGTH_SHORT).show()
    }

    override fun buttonPressed(function: () -> Unit) {
        binding.buttonShowText.setOnClickListener { function() }
    }
}
