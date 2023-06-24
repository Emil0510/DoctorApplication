package com.emilabdurahmanli.doctorapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.emilabdurahmanli.doctorapplication.R
import com.emilabdurahmanli.doctorapplication.adapter.Adapter
import com.emilabdurahmanli.doctorapplication.databinding.ActivityMainBinding
import com.emilabdurahmanli.doctorapplication.model.Doctor

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var list = mutableListOf<Doctor>(Doctor(R.drawable.doctor1,"dr. Gilang Segara Bening","Heart","Persahabatan Hospital",R.drawable.open,1221),
        Doctor(R.drawable.doctor2,"dr. Shabil Chan","Dental","Columbia Asia Hospital",R.drawable.open,964),
        Doctor(R.drawable.doctor3,"dr. Mustakim","Eye","Salemba Carolus Hospital",R.drawable.close,762),
        Doctor(R.drawable.doctor4,"dr. Suprihatini","Heart","Salemba Carolus Hospital",R.drawable.open,762))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerView.adapter = Adapter(list)
    }
}