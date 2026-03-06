package com.example.revisao

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.revisao.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.Login.setOnClickListener {
            val login = binding.logininput.text.toString().trim()
            val senha = binding.senhainput.text.toString().trim()

            if(login=="adimin" && senha=="Opaaa"){
                val intent = Intent(this, Activity_dashboard::class.java)
                intent.putExtra("LOGIN_USUARIO",login)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this,"login ou senha incorreta",Toast.LENGTH_SHORT)
            }
        }

    }
}