package com.lowkey.browser.devices

data class DeviceProfile(
    val model: String,
    val androidVersion: String,
    val userAgent: String,
    val proxy: String
)
