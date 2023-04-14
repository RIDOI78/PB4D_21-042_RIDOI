package com.example.praktikumm_modul2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MobilsportAdapter(private val context: Context, private val mobilsport: List<Mobilsport>, val listener: (Mobilsport) -> Unit)
    : RecyclerView.Adapter<MobilsportAdapter.MobilsportViewHolder>(){

    class MobilsportViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgMobilsport = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameMobilsport = view.findViewById<TextView>(R.id.tv_item_name)
        val descMobilsport = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(mobilsport: Mobilsport, listener: (Mobilsport) -> Unit){
            imgMobilsport.setImageResource(mobilsport.imgMobilsport)
            nameMobilsport.text = mobilsport.nameMobilsport
            descMobilsport.text = mobilsport.descMobilsport
            itemView.setOnClickListener {
                listener(mobilsport)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobilsportViewHolder {
        return MobilsportViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_mobilsport, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MobilsportViewHolder, position: Int) {
        holder.bindView(mobilsport[position], listener)
    }

    override fun getItemCount(): Int = mobilsport.size
    }

