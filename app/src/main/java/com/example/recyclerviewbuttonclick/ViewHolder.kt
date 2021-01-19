package com.example.recyclerviewbuttonclick

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    var tvTitle : TextView = itemView.tvTitle
    var tvDescription : TextView = itemView.tvDescription

    fun populateModel(user: User, activity: MainActivity, size : Int, position: Int){
        tvTitle.text = user.title
        tvDescription.text = user.description
        itemView.setOnClickListener {
            activity.onItemClicked(size, position)
        }
    }

}