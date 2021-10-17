package com.example.alertdialogbonus

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    lateinit var tvv:TextView
    var rrtt = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvv = findViewById(R.id.textView2)
        btn = findViewById(R.id.button)

        tvv.text =rrtt

        btn.setOnClickListener {
            alertShow()
        }
    }
    fun alertShow(){
        val db = AlertDialog.Builder(this)
        db.setMessage("Typa Any Thing")

        val tva = EditText(this)
        db.setView(tva)

        db.setPositiveButton("Add", DialogInterface.OnClickListener{

                dialog,id -> tvv.text = tva.text.toString()

        })
        db.setNegativeButton("go", DialogInterface.OnClickListener{
                dialog,id -> intit(tva.text.toString())
        })
        val alert = db.create()
//        alert.setTitle("New")
        alert.show()

    }

    fun intit(uu:String){
        val intent = Intent(this,MainActivity2::class.java)
            .putExtra("uu","$uu")
        startActivity(intent)
    }
}