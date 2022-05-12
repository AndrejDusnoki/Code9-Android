package com.liveramp.companyfinder.ui.activity

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.liveramp.companyfinder.ui.model.Company
import java.io.IOException
import java.io.InputStream
import java.nio.charset.Charset


class CompanyRepository {
   public fun getCompanyList(context: Context): List<Company>? {
        // var companyList : MutableList<Company> = mutableListOf()
        var json: String? = null
        json = try {
            val inputStream: InputStream = context.assets.open("companies.json")
            val size: Int = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            String(buffer, Charset.defaultCharset())
        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }
        val listObjects = object : TypeToken<List<Company>>() {}.type
        return Gson().fromJson(json, listObjects)
    }
}