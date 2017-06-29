package com.example.topake.dagger2kotlinsample.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.topake.dagger2kotlinsample.R
import com.example.topake.dagger2kotlinsample.helper.DummyHelper
import com.example.topake.dagger2kotlinsample.helper.DummyContextDependentHelper
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(){

    @Inject lateinit var dummyContextDependentHelper: DummyContextDependentHelper
    @Inject lateinit var dummyHelper : DummyHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, dummyContextDependentHelper.getString("asd"), Toast.LENGTH_SHORT).show()
        Toast.makeText(this, dummyHelper.get(), Toast.LENGTH_SHORT).show()
    }
}
