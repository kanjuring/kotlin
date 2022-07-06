package com.example.regkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.regkotlin.databinding.ActivityMainBinding
import com.example.regkotlin.databinding.ActivityValidRegistationBinding

class ValidRegistation : AppCompatActivity() {

    lateinit var binding: ActivityValidRegistationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityValidRegistationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        binding.etName.setText(name)

        val email = intent.getStringExtra("email")
        binding.etEmail.setText(email)

        val password = intent.getStringExtra("password")
        binding.etPass.setText(password)

        val mobile = intent.getStringExtra("mobile")
        binding.etMobile.setText(mobile)


    }
}