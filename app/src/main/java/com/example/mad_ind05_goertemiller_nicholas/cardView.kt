package com.example.mad_ind05_goertemiller_nicholas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class cardView (private val listStates: ArrayList<states>): RecyclerView.Adapter<cardView.CardViewViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder{
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_states,parent, false)
        return CardViewViewHolder(view)
    }


    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val state = listStates[position]

        Glide.with(holder.itemView.context)
            .load(state.photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPic)


        holder.stateNickName.text= state.detail


    }

    override fun getItemCount(): Int {
        return listStates.size

    }

    inner class CardViewViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        var imgPic : ImageView = itemView.findViewById(R.id.img_pic)
        var stateNickName : TextView = itemView.findViewById(R.id.stateNick_name)

    }
}