package com.example.koin.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.koin.R
import com.example.koin.viewmodels.WelcomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    // Inject ViewModel bằng Koin
    private val welcomeViewModel: WelcomeViewModel by viewModel()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton = findViewById<Button>(R.id.show_button)

        showButton.setOnClickListener {
            val message = welcomeViewModel.getWelcomeMessage()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}