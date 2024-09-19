package com.tugasmobileyuni.model

import com.tugasmobileyuni.R

data class ModelBuah(
    val image: Int,
    val judul: String
)

object Mocklist {
    fun  getModel(): List<ModelBuah> {
        val item1 = ModelBuah(
            R.drawable.apple,
            "Aple"
        )
        val item2 = ModelBuah(
            R.drawable.grapes,
            "Anggur"
        )
        val item3 = ModelBuah(
            R.drawable.apple,
            "Aple"
        )

        val item4 = ModelBuah(
            R.drawable.pear,
            "pear"
        )
        val item5 = ModelBuah(
            R.drawable.lucy,
            "luci"
        )
        val item6 = ModelBuah(
            R.drawable.strawberry,
            "Srowbarry"
        )
        val  itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        return itemList
    }
}
