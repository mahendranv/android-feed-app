package com.ex2.feedapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ex2.feedapp.presenter.FeedListFragment
import com.ex2.weather.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentHost, FeedListFragment())
            .commit()
    }
}