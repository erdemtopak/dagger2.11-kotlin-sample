package com.example.topake.dagger2kotlinsample.ui.detail

import android.os.Bundle
import android.widget.Toast
import com.example.topake.dagger2kotlinsample.R
import com.example.topake.dagger2kotlinsample.core.BaseActivity
import javax.inject.Inject

/**
 * Created by topake on 29/06/2017.
 */

class DetailActivity : BaseActivity() {

    @Inject lateinit var detailDataSource : DetailDataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Toast.makeText(this, detailDataSource.get(), Toast.LENGTH_SHORT).show()
    }

}