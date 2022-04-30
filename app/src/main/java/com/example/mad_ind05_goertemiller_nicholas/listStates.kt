package com.example.mad_ind05_goertemiller_nicholas

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class listStates(val listState: ArrayList<states>) :
    RecyclerView.Adapter<listStates.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: states)
    }

    fun  setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i : Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_states, viewGroup, false)
        return ListViewHolder(view)
    }


    override fun onBindViewHolder(holder: listStates.ListViewHolder, position: Int) {

        val State = listState[position]

        Glide.with(holder.itemView.context)
            .load(State.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.name.text = State.name
        holder.tvDetail.text = State.detail

        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context, "" + listState[position].name, Toast.LENGTH_SHORT).show()
            val moveIntent = Intent(holder.itemView.context, DetailActivity::class.java)
            moveIntent.putExtra("nameOfState", State.name)
            moveIntent.putExtra("nickName", State.detail)
            moveIntent.putExtra("pic", State.photo)
            holder.itemView.context.startActivity(moveIntent)
        }
    }

    override fun getItemCount(): Int {
        return listState.size

    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id._name)
        var tvDetail: TextView = itemView.findViewById(R.id.stateNick_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_pic)

    }

}


