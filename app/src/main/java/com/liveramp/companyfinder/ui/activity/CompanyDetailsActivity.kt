package com.liveramp.companyfinder.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.liveramp.companyfinder.R
import com.liveramp.companyfinder.databinding.ActivityCompanyDetailsBinding
import com.liveramp.companyfinder.databinding.ActivityCompanyListBinding
import com.liveramp.companyfinder.ui.model.Company

class CompanyDetailsActivity : AppCompatActivity() {
    lateinit var binding : ActivityCompanyDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompanyDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val company = intent.getSerializableExtra("COMPANY") as Company
        binding.tvCompanyValue.text = company.company
    }
}