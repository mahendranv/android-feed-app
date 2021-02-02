package com.ex2.core.bindings

interface PreferenceStore {

    fun put(key: String, value: String)

    fun get(key: String): String?
}