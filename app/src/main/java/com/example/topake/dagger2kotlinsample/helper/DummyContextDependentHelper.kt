package com.example.topake.dagger2kotlinsample.helper

import android.content.Context
import com.example.topake.dagger2kotlinsample.R
import timber.log.Timber

/**
 * Created by topake on 28/06/2017.
 */

class DummyContextDependentHelper(val context: Context) {

    init {
        Timber.d("DummyContextDependentHelper#init")
    }

    fun getString(key: String): String {
        Timber.d("DummyContextDependentHelper#getString")
        return context.getString(R.string.dummy_text)
    }
}