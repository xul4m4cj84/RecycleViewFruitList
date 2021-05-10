package com.example.recycleviewballlist

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class BallAdapter(val ballList: List<Balls>): Adapter<BallAdapter.ViewHolder>() {

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val ballImage: ImageView = view.findViewById(R.id.imageView)
        val ballName: TextView = view.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //val view = LayoutInflater.from(parent.context).inflate(R.layout.my_layout, parent, false)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_layout, parent, false)
        val viewHolder = ViewHolder(view)
        viewHolder.itemView.setOnClickListener {
            //Toast.makeText(parent.context, ballList[viewHolder.bindingAdapterPosition].name, Toast.LENGTH_SHORT).show()

            val intent = Intent()
            intent.putExtra("name", ballList[viewHolder.bindingAdapterPosition].name)
            intent.setClass(it.context , MainDetail::class.java)
            it.context.startActivity(intent)
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return ballList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ball = ballList[position]
        holder.ballImage.setImageResource(ball.imageId)
        holder.ballName.text = ball.name
    }
}