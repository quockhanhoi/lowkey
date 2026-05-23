package com.lowkey.browser.browser

import android.annotation.SuppressLint
import android.webkit.WebView
import android.webkit.WebViewClient

@SuppressLint("SetJavaScriptEnabled")
fun setupWebView(webView: WebView) {

    webView.settings.javaScriptEnabled = true
    webView.settings.domStorageEnabled = true
    webView.settings.loadsImagesAutomatically = true

    webView.webViewClient = WebViewClient()

    webView.loadUrl("https://google.com")
}
