package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         binding.button.setOnClickListener {
             if (binding.fullNameET.text.toString().isBlank()){
                 binding.fullNameET.error = "این فیلد خالی است . "
                 binding.showAnsware.setText("لطفا نام خود را وارد کنید . ")
             }else if (binding.phoneET.text.toString().isBlank() ||
                     binding.phoneET.text.toString().trimIndent().length != 11){
                 binding.phoneET.error = "لطفا شماره صحیح را وارد کنید. "
                 binding.showAnsware.setText("شماره باید 11 رقم باشد .")
             }else {
                 binding.showAnsware.setText("${binding.fullNameET.text}سلام   ")
             }
             }
         }
    }
