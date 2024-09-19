package com.fanntt.app_mobile_irfann_mi2c.model

import com.fanntt.app_mobile_irfann_mi2c.R

data class ModelBuah(
    val image : Int,
    val nama : String
)
//kita mock data untuk array

object MockList{

    fun getModel() : List<ModelBuah>{
        val itemModel1 = ModelBuah(
            R.drawable.apel,//ALT + ENTER (Import)
            "Apel"
        )
        val itemModel2 = ModelBuah(
            R.drawable.anggur,
            "Anggur"
        )
        val itemModel3 = ModelBuah(
            R.drawable.jeruk,
            "Jeruk"
        )
        val itemModel4 = ModelBuah(
            R.drawable.rambutan,
            "Rambutan"
        )
        val itemModel5 = ModelBuah(
            R.drawable.nanas,
            "Nanas"
        )
        val itemModel6 = ModelBuah(
            R.drawable.pisang,
            "Pisang"
        )
        val itemModel7 = ModelBuah(
            R.drawable.manggis,
            "Manggis"
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)

        return itemList

    }
}
