package com.tugasmobileyuni.Adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tugasmobileyuni.R
import com.tugasmobileyuni.model.ModelBuah

class BuahAdapter(val itemList: ArrayList<ModelBuah>) :
    RecyclerView.Adapter<BuahAdapter.MyViewHolder>(){

        class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
            var itemImage :  ImageView
            var itemText : TextView

            init {
                itemImage = itemView.findViewById(R.id.gambar)
                itemText = itemView.findViewById(R.id.nama_buah)

            }
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahAdapter.MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_costume_buah,parent,false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: BuahAdapter.MyViewHolder, position: Int) {
       holder.itemText.setText(itemList[position].judul)
        holder.itemImage.setImageResource(itemList[position].image)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}