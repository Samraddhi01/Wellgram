package com.example.doctorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class NewDhashboardActivity extends AppCompatActivity {

    LinearLayout medicinesButton;
    LinearLayout consultantButton;
    LinearLayout blogButton;
    LinearLayout doctor1;
    LinearLayout doctor2;
    LinearLayout doctor3;
    LinearLayout doctor4;
    LinearLayout doctor5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_dhashboard);

        medicinesButton = findViewById(R.id.medicinesButton);
        consultantButton = findViewById(R.id.consultantButton);
        blogButton = findViewById(R.id.blogButton);
        doctor1 = findViewById(R.id.doctor1);
        doctor1 = findViewById(R.id.doctor2);
        doctor1 = findViewById(R.id.doctor3);
        doctor1 = findViewById(R.id.doctor4);
        doctor1 = findViewById(R.id.doctor5);

        medicinesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NewDhashboardActivity.this, MedicineActivity.class));
            }
        });

        consultantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NewDhashboardActivity.this, DoctorActivity.class));
            }
        });

        blogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NewDhashboardActivity.this, BlogsActivity.class));
            }
        });
    }
}