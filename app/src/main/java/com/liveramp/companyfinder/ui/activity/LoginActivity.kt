package com.liveramp.companyfinder.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.liveramp.companyfinder.R
import com.liveramp.companyfinder.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnLogin.setOnClickListener {
            if(isValidLogin()){
                val intent = Intent(this, CompanyListActivity::class.java)
                startActivity(intent)
            } else {
                Toast
                .makeText(baseContext, resources.getString(R.string.login_fail_message)
                    , Toast.LENGTH_SHORT).show()
            }

        }
    }

    private fun isValidLogin() : Boolean{
        return !binding.etUsername.text.isNullOrEmpty()
                && !binding.etPassword.text.isNullOrEmpty()
    }
}