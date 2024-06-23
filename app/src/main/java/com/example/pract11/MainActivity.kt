package com.example.pract11

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val textView: TextView = findViewById(R.id.textView)
        val layout: ConstraintLayout = findViewById(R.id.layout)
        when (item.itemId){
            R.id.action1->{
                textView.text ="Вы выбрали красный цвет!"
                layout.setBackgroundColor(Color.parseColor("#EC4849"))
                Toast.makeText(this,"Красный",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action2->{
                textView.text ="Вы выбрали синий цвет!"
                layout.setBackgroundColor(Color.parseColor("#0674CC"))
                Toast.makeText(this,"Синий",Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action3->{
                textView.text ="Вы выбрали зелёный цвет!"
                layout.setBackgroundColor(Color.parseColor("#95FF79"))
                Toast.makeText(this,"Зелёный",Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }
}