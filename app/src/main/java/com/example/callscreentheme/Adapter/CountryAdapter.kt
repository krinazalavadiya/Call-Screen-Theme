package com.kinnu.country.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.callscreentheme.CountryActivity
import com.example.callscreentheme.R
import com.kinnu.country.Model.ContryData



class CountryAdapter(datalist: List<ContryData>?) : RecyclerView.Adapter<CountryAdapter.CountryHolder>() {


    var datalist = datalist
    lateinit var context:Context
    class CountryHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var img = itemView.findViewById<ImageView>(R.id.img)
        var name = itemView.findViewById<TextView>(R.id.name)
        var contry = itemView.findViewById<CardView>(R.id.country)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryHolder {
        context = parent.context
        return CountryHolder(LayoutInflater.from(parent.context).inflate(R.layout.country_item,parent,false))
    }

    override fun onBindViewHolder(holder: CountryHolder, position: Int) {
        holder.name.text = datalist?.get(position)?.name
        holder.contry.setOnClickListener {
            var intent = Intent(context, CountryActivity::class.java)
            intent.putExtra("name",position)
            context.startActivity(intent)

        }

        Glide.with(context).load(datalist?.get(position)?.flags?.png).into(holder.img)
    }

    override fun getItemCount(): Int {

        return datalist?.size!!

    }
}