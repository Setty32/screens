package com.cleverlance.mobile.android.screens.presenter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import io.reactivex.disposables.Disposable

abstract class BasePresenterView {
    lateinit var activity: Activity
    lateinit var rootView: View

    internal abstract fun createView(container: ViewGroup): View

    abstract fun bindPresenter(): Disposable
}