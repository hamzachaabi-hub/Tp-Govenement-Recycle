package com.example.tprecycle
import android.view.View.OnClickListener
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class deleteGov(var adapter: CardAdapter) {
     fun checked(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean {
        val adapter = recyclerView.adapter as CardAdapter
        val from = viewHolder.adapterPosition
        val to = target.adapterPosition
        adapter.notifyItemMoved(from, to)
        return true
    }



    fun OnClickListener(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        var pos=viewHolder.adapterPosition
        adapter.deleteItem(pos)
    }



}