package com.emilabdurahmanli.doctorapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emilabdurahmanli.doctorapplication.R
import com.emilabdurahmanli.doctorapplication.databinding.ActivityDoctorBinding

class DoctorActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDoctorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDoctorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent

    }
}