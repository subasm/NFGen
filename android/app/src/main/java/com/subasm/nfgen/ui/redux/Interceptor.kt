package com.subasm.nfgen.ui.redux

interface Interceptor {
    fun intercept(label: String, action: Action)
    fun intercept(label: String, result: Result)
    fun intercept(label: String, state: ViewState)
}
