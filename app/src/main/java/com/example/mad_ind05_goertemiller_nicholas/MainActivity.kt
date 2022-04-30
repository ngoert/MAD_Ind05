package com.example.mad_ind05_goertemiller_nicholas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var states: RecyclerView
    private var list: ArrayList<states> = arrayListOf()

    private fun showStates(state: states) {
        Toast.makeText(this, "" + state.name, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        states = findViewById(R.id.test)
        states.setHasFixedSize(true)

        list.addAll(statesData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        states.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = listStates(list)
        states.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallback(object : listStates.OnItemClickCallback {
            override fun onItemClicked(data: states) {
                showStates(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerCardView() {
        states.layoutManager = LinearLayoutManager(this)
        val cardViewFoodAdapter = cardView(list)
        states.adapter = cardViewFoodAdapter
    }
}