package com.emilabdurahmanli.doctorapplication.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.emilabdurahmanli.doctorapplication.activity.DoctorActivity
import com.emilabdurahmanli.doctorapplication.databinding.RecyclerViewRowBinding
import com.emilabdurahmanli.doctorapplication.model.Doctor

class Adapter (var list : List<Doctor>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class ViewHolder(var binding : RecyclerViewRowBinding):RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RecyclerViewRowBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.doctorImageView.setImageResource(list[position].image)
        holder.binding.doctorNameTV.setText(list[position].name)
        holder.binding.doctorProfessionTV.setText(list[position].profession)
        holder.binding.hospitalTV.setText(list[position].hospital)
        holder.binding.openCloseImageView.setImageResource(list[position].openClose)
        holder.binding.viewCountTV.setText("(${list[position].viewCount.toString()})")
        val intent = Intent(holder.binding.root.context,DoctorActivity::class.java)
        intent.putExtra("Doctor",list[position])
        holder.binding.root.setOnClickListener {
            holder.binding.root.context.startActivity(intent)
        }
    }
}