package com.example.buttonavigation

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.buttonavigation.databinding.ItemListBinding

class Adapter (private val ListData : ArrayList<item>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder (val binding : ItemListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val layout = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
       return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val data = ListData[position]
       holder.binding.textView.text = data.nama
       holder.binding.imageView.setImageResource(data.img)

        holder.itemView.setOnClickListener {
            Toast.makeText(it.context, "ini buah ${data.nama}" , Toast.LENGTH_SHORT).show()
        }
    }


    override fun getItemCount(): Int {
        return ListData.size
    }


}