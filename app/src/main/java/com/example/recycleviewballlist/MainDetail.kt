package com.example.recycleviewballlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageSwitcher
import android.widget.ImageView
import com.example.recycleviewballlist.databinding.ActivityMainDetailBinding

class MainDetail : AppCompatActivity() {

    private lateinit var detailBinding: ActivityMainDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityMainDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        val toolbar = detailBinding.toolBar
        toolbar.title = "Detailed Information"
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val name = intent.getStringExtra("name")
        detailBinding.textView2.text = name
        when(name){
            "Baseball"-> detailBinding.imageView2.setImageResource(R.drawable.baseball_photo)
            "Basketball"-> detailBinding.imageView2.setImageResource(R.drawable.basketball_photo)
            "Football"-> detailBinding.imageView2.setImageResource(R.drawable.football_photo)
            "Other"-> detailBinding.imageView2.setImageResource(R.drawable.other_photo)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}