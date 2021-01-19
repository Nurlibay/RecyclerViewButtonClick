package com.example.recyclerviewbuttonclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var adapter : Adapter = Adapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        setModels(0, 1)
    }

    private fun setModels(size: Int, count : Int){
        val models : MutableList<User> = mutableListOf()
        for (i in 0 until size + count){
            val model : User = User()
            model.title = "Title ${i + 1}"
            model.description = "Description ${i + 1}"
            models.add(model)
        }
        adapter.setData(models)
    }

    fun onItemClicked(size : Int, position: Int){
        //Toast.makeText(this, "${user.title} is Clicked", Toast.LENGTH_SHORT).show()
        setModels(size, position + 1)
    }

}