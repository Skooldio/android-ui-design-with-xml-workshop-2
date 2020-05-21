package com.skooldio.android.designlayout.workshop2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ReviewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val TYPE_HEADER = 0
        private const val TYPE_REVIEW = 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = when (viewType) {
        TYPE_HEADER -> HeaderViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_header_item, parent, false))
        else -> ReviewViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_review_item, parent, false))
    }

    override fun getItemCount(): Int = 20 + 1

    override fun getItemViewType(position: Int): Int = when (position) {
        0 -> TYPE_HEADER
        else -> TYPE_REVIEW
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {}
}
