package com.fanntt.app_mobile_irfann_mi2c.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.fanntt.app_mobile_irfann_mi2c.DetailBuah
import com.fanntt.app_mobile_irfann_mi2c.MovieActivity
import com.fanntt.app_mobile_irfann_mi2c.R
import com.fanntt.app_mobile_irfann_mi2c.WelcomePageAcitivity
import com.fanntt.app_mobile_irfann_mi2c.model.ModelMovie
import com.google.android.material.animation.AnimatableView.Listener

class MovieAdapter  constructor(
    private val getActivity : MovieActivity,// supaya item pada recycle dapat di klik
    private val movieList : List<ModelMovie>



)  : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val onItemCLick : ((ModelMovie) -> Unit)?= null
        val txtMovie : TextView = itemView.findViewById(R.id.txtMovie)
        val imgMovie : ImageView = itemView.findViewById(R.id.imgMovie)
        val cardMovie : CardView = itemView.findViewById(R.id.cardMovie)


        

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_card,parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)
        // supaya bisa di klik
        holder.cardMovie.setOnClickListener(){

            //deklarasi intent
            val intent = Intent(getActivity, DetailBuah::class.java)
            //put Extra
            intent.putExtra("image", movieList[position].image)
            intent.putExtra("nama",movieList[position].title)
            //intent.putExtra("judul",itemList[position].judul)
            // start pindah ke detail
            getActivity.startActivity(intent)

            Toast.makeText(getActivity,movieList[position].title, Toast.LENGTH_SHORT).show()

        }
    }
}