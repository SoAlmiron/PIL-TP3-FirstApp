package com.example.pil_app_hello_word.mvp.contract

interface MainContract {
    interface View {
        fun getTextInput(): String
        fun showError()
        fun showText(text: String)
        fun buttonPressed(function: () -> Unit)
    }

    interface Presenter {
        fun onButtonPressed()
    }
}