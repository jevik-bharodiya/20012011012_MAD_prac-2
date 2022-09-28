package com.example.a20012011012_mad_prac_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "Main Activity"
    private lateinit var my: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        my = findViewById(R.id.my)
        Log.i(TAG,"onCreate function called")
        Toast.makeText(this,"onCreate function called",Toast.LENGTH_SHORT).show()
        Snackbar.make(my,"onCreate function called",Snackbar.LENGTH_SHORT).show()

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart function called")
        Toast.makeText(this,"onStart function called",Toast.LENGTH_SHORT).show()
        Snackbar.make(my,"onStart function called",Snackbar.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume function called")
        Toast.makeText(this,"onResume function called",Toast.LENGTH_SHORT).show()
        Snackbar.make(my,"onResume function called",Snackbar.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onStop function called")
        Toast.makeText(this,"onPause function called",Toast.LENGTH_SHORT).show()
        Snackbar.make(my,"onPause function called",Snackbar.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop function called")
        Toast.makeText(this,"onStop function called",Toast.LENGTH_SHORT).show()
        Snackbar.make(my,"onStop function called",Snackbar.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG,"onRestart function called")
        Toast.makeText(this,"onRestart function called",Toast.LENGTH_SHORT).show()
        Snackbar.make(my,"onRestart function called",Snackbar.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy function called")
        Toast.makeText(this,"onDestroy function called",Toast.LENGTH_SHORT).show()
        Snackbar.make(my,"onDestroy function called",Snackbar.LENGTH_SHORT).show()
    }

}