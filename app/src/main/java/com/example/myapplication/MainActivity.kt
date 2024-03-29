package com.example.myapplication

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.myapplication.ui.main.SectionsPagerAdapter
import com.heapanalytics.android.Heap

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
//    Heap.init(this, "aProjectId")
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
    val viewPager: ViewPager = findViewById(R.id.view_pager)
    viewPager.adapter = sectionsPagerAdapter
    val tabs: TabLayout = findViewById(R.id.tabs)
    tabs.setupWithViewPager(viewPager)
    val fab: FloatingActionButton = findViewById(R.id.fab)

    fab.setOnClickListener { view ->
      Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
          .setAction("Action", null).show()
    }
  }
}