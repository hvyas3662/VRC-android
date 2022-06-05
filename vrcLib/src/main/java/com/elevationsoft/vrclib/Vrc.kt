package com.elevationsoft.vrclib

@Suppress("unused")
open class Vrc(private val url: String, private val payload: Map<String, String>) {

    //get proper url from base url and payload
    fun getRequestedUrl(): String {
        var newUrl = "$url?"
        for (i in 0 until payload.size) {
            val key = payload.keys.toTypedArray()[i]
            newUrl = newUrl + key + "=" + payload[key] + "&"
        }
        newUrl = newUrl.substring(0, newUrl.length - 1)
        return newUrl
    }

    //get params value via key
    fun getParams(key: String): String {
        val value = payload[key]
        return value ?: "Key not exist"
    }

}