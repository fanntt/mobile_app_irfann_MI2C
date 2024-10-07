package com.fanntt.app_mobile_irfann_mi2c.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fanntt.app_mobile_irfann_mi2c.DetailBuah
import com.fanntt.app_mobile_irfann_mi2c.R
import com.fanntt.app_mobile_irfann_mi2c.RecycleBuahActivity
import com.fanntt.app_mobile_irfann_mi2c.model.ModelBuah

class BuahAdapter (
    val itemList: ArrayList<ModelBuah>,
    private val getActivity : RecycleBuahActivity // untuk bisa memanggil intent
):
    RecyclerView.Adapter<BuahAdapter.MyViewHolder>()
{
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        //deklarasi widget dari layout item
        var itemImage : ImageView
        var itemNama : TextView
        init {
            itemImage = itemView.findViewById(R.id.gambar) as ImageView
            itemNama = itemView.findViewById(R.id.nama) as TextView
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //manggil layout
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_images, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
       return  itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       //set data ke widget
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemNama.setText(itemList[position].nama)

        // intent untuk passing data

        holder.itemView.setOnClickListener(){
            //deklarasi intent
            val intent = Intent(getActivity, DetailBuah::class.java)
            //put Extra
            intent.putExtra("image", itemList[position].image)
            intent.putExtra("nama",itemList[position].nama)
            //intent.putExtra("judul",itemList[position].judul)
            // start pindah ke detail
            getActivity.startActivity(intent)

        }

    }

}