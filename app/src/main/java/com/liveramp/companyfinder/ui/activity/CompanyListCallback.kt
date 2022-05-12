package com.liveramp.companyfinder.ui.activity

import com.liveramp.companyfinder.ui.model.Company

interface CompanyListCallback {
    fun onItemSelected(company : Company)
}