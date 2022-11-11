package com.example.tprecycle

import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBindings
import com.example.tprecycle.databinding.CardCellBinding


class CardViewHolder(private val cardCellBinding: CardCellBinding, private val clickListener: GovClickListener) : RecyclerView.ViewHolder(cardCellBinding.root) {
        fun bindGov(Gov: Gov) {
            cardCellBinding.cover.setImageResource(Gov.cover)
            cardCellBinding.title.text = Gov.title

            cardCellBinding.cardView.setOnClickListener {
                clickListener.onClick(Gov)
            }
        }
    }

