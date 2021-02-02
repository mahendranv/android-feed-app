package com.ex2.feedapp.framework

import android.content.Context
import com.ex2.core.bindings.PreferenceStore
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class AndroidPreferenceStore @Inject constructor(@ApplicationContext context: Context) :
    PreferenceStore {

    private val preference = context.getSharedPreferences("core-prefs", Context.MODE_PRIVATE)

    override fun put(key: String, value: String) {
        preference.edit()
            .putString(key, value)
            .apply()
    }

    override fun get(key: String): String? {
        return preference.getString(key, null)
    }
}