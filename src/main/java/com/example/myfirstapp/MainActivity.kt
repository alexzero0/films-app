package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Visit(view: View) {
        val vis = Intent(this,Activity_Second::class.java)

        val name = findViewById<EditText>(R.id.user_name).toString()

        vis.putExtra(Activity_Second.Name,name)
        startActivity(vis)
    }

}