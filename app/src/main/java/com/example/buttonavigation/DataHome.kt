package com.example.buttonavigation


object DataHome {
    val name = arrayListOf (
        "Alpukat",
        "Apel",
        "Durian",
        "Jambuair",
        "Manggis"
            )
    val img = arrayListOf (
        R.drawable.alpukat,
        R.drawable.apel,
        R.drawable.durian,
        R.drawable.jambuair,
        R.drawable.manggis,
            )
    val ListItem : ArrayList<item>
    get () {
        val list = arrayListOf<item>()
        for (i in name.indices){
            val item = item()
            item.nama = name[i]
            item.img = img[i]
            list.add(item)
        }
        return list
    }
}