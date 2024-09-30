package com.practice.focusarausrex

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent

class Navigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_navigation)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Get references to your buttons
        val btnAlerts = findViewById<Button>(R.id.btnAlerts)
        val btnTimer = findViewById<Button>(R.id.btnTimer)
        val btnAnalytics = findViewById<Button>(R.id.btnAnalytics)
        val btnTimeSheet = findViewById<Button>(R.id.btnTimeSheet)
        val btnInvoicing = findViewById<Button>(R.id.btnInvoicing)
        val btnTimeline = findViewById<Button>(R.id.btnTimeline)
        val btnNavBack = findViewById<Button>(R.id.btnNavBack)

        // Set click listeners for each button
        btnAlerts.setOnClickListener {
           // val intent = Intent(this, AlertsActivity::class)
            startActivity(intent)
        }

        btnTimer.setOnClickListener {
           // val intent = Intent(this, TimerActivity::class)
            startActivity(intent)
        }

        btnAnalytics.setOnClickListener {
           // val intent = Intent(this, AnalyticsActivity::class)
            startActivity(intent)
        }

        btnTimeSheet.setOnClickListener {
           // val intent = Intent(this, TimeSheetActivity::class)
            startActivity(intent)
        }

        btnInvoicing.setOnClickListener {
           // val intent = Intent(this, InvoicingActivity::class)
            startActivity(intent)
        }

        btnTimeline.setOnClickListener {
            //val intent = Intent(this, TimelineActivity::class)
            startActivity(intent)
        }

        btnNavBack.setOnClickListener {
            // Implement navigation back logic here
            // For example, you can finish the current activity to go back
            finish()
        }
    }
}