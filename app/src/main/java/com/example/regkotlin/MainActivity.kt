package com.example.regkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.regkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSubmit.setOnClickListener {

            val name = binding.etName.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPass.text.toString().trim()
      //      val conpassword = binding.etConpass.text.toString().trim()
            val mobile = binding.etMobile.text.toString().trim()


            val intent=Intent(this,ValidRegistation::class.java)
            intent.putExtra("name",name)
            intent.putExtra("email",email)
            intent.putExtra("password",password)
            intent.putExtra("mobile",mobile)
            startActivity(intent)
        }
    }
}