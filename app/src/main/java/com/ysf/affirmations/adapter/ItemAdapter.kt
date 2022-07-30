package com.ysf.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ysf.affirmations.R
import com.ysf.affirmations.model.Affirmation

class ItemAdapter(private val context: Context, private val dataSet: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) :
        RecyclerView.ViewHolder(view) { // Defining a class inside another class is called creating a nested class.

        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView:ImageView=view.findViewById(R.id.item_image)
    }

    //The onCreateViewHolder()method is called by the layout manager to create new view holders for the RecyclerView (when there are no existing view holders that can be reused).
// Remember that a view holder represents a single list item view.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView.text=context.resources.getString(item.stringResorceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int { // The getItemCount() method needs to return the size of your dataset.
        return dataSet.size
    }
}