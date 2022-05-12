package com.liveramp.companyfinder.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.liveramp.companyfinder.databinding.ActivityCompanyListBinding
import com.liveramp.companyfinder.ui.model.Company


class CompanyListActivity : AppCompatActivity(), CompanyListCallback {
    lateinit var binding: ActivityCompanyListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompanyListBinding.inflate(layoutInflater)
        val view = binding.root
        val rvCompanies = binding.rvCompanies
        val companyList = CompanyRepository().getCompanyList(baseContext)
        rvCompanies.layoutManager = LinearLayoutManager(baseContext)
        rvCompanies.adapter = CompanyListAdapter(companyList!!, this)
        setContentView(view)
    }

    override fun onItemSelected(company: Company) {
        val intent = Intent(baseContext, CompanyDetailsActivity::class.java)
        intent.putExtra("COMPANY", company)
        startActivity(intent)
    }
}