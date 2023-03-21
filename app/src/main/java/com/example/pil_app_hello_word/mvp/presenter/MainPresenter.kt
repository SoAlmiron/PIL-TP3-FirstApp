package com.example.pil_app_hello_word.mvp.presenter

import com.example.pil_app_hello_word.mvp.contract.MainContract

class MainPresenter (private var view: MainContract.View) : MainContract.Presenter {
    init {
        view.buttonPressed{ onButtonPressed() }
    }
    override fun onButtonPressed() {
        val text = view.getTextInput()
        if (text.isEmpty()) {
            view.showError()
        } else {
            view.showText(text)
        }
    }
}