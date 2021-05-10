package com.example.recycleviewballlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewballlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val ballList = ArrayList<Balls>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBallList()  //set up the data source
        //val layoutManager = LinearLayoutManager(this)
        val layoutManager = LinearLayoutManager(this, GridLayoutManager.VERTICAL, false)
        binding.recycleView.layoutManager = layoutManager
        val adapter = BallAdapter(ballList)  //customized your own adapter
        binding.recycleView.adapter = adapter
        //binding.recycleView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }

    private fun initBallList() {
            ballList.add(Balls("Baseball",R.drawable.baseball))
            ballList.add(Balls("Basketball",R.drawable.basketball))
            ballList.add(Balls("Football",R.drawable.football))
            ballList.add(Balls("Other",R.drawable.other))
    }
}
