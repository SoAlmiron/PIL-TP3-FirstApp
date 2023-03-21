package com.example.pil_app_hello_word
import com.example.pil_app_hello_word.mvp.contract.MainContract
import com.example.pil_app_hello_word.mvp.presenter.MainPresenter
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {

    @RelaxedMockK
    private lateinit var presenter: MainContract.Presenter
    private lateinit var view: MainContract.View

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        presenter = MainPresenter(view)
    }

    @Test
    fun `user enters a text that should be displayed`() {
        every { view.getTextInput() } returns "hello"
        presenter.onButtonPressed()
        verify { view.showText("hello") }
    }

    @Test
    fun `user not enter a text, error is displayed`(){
        every { view.getTextInput() } returns ""
        presenter.onButtonPressed()
        verify { view.showError() }
    }
}

