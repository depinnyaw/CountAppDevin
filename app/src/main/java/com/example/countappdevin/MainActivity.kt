package com.example.countappdevin

import android.os.Binder
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.countappdevin.databinding.ActivityMainBinding

// bikin variable untuk bididng
private lateinit var binding : ActivityMainBinding
var counter = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // inisisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        // set contenct dari activity untuk menggunakan binding view root
        setContentView(binding.root)

        //sekarang bisa akses ui element di code blue:
        with (receiver = binding) {
            // akses ui by id
            txtNumber.text = counter.toString()

            //ketika button count diklik
            btnCount.setOnClickListener {
                counter ++
                txtNumber.text = counter.toString()
            }

            //ketika button toast click
            btnToast.setOnClickListener {
                Toast.makeText(
                    context = this@MainActivity,
                    text ="Counter: $counter",
                    duration = Toast.LENGTH_SHORT
                ) .show()
            }





        }
    }
}