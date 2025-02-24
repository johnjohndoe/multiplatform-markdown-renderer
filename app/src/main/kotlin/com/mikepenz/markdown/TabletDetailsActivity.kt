package com.mikepenz.markdown

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView

class TabletDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablet_details)
        findViewById<FragmentContainerView>(R.id.details_container)?.let {
            TabletDetailsFragment.replace(supportFragmentManager, it.id)
        }
    }

}
