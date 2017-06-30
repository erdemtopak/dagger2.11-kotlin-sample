package com.example.topake.dagger2kotlinsample.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import butterknife.bindView
import com.example.topake.dagger2kotlinsample.R
import com.example.topake.dagger2kotlinsample.core.BaseActivity
import com.example.topake.dagger2kotlinsample.helper.DummyContextDependentHelper
import com.example.topake.dagger2kotlinsample.helper.DummyHelper
import com.example.topake.dagger2kotlinsample.ui.detail.DetailActivity
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject lateinit var dummyContextDependentHelper: DummyContextDependentHelper
    @Inject lateinit var dummyHelper: DummyHelper

    val buttonDetail: Button by bindView(R.id.main_button_detail)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, dummyContextDependentHelper.getString("asd"), Toast.LENGTH_SHORT).show()
        Toast.makeText(this, dummyHelper.get(), Toast.LENGTH_SHORT).show()

        buttonDetail.setOnClickListener({ startActivity(Intent(this, DetailActivity::class.java)) })

    }
}
