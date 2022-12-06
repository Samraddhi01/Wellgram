package com.example.doctorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;

public class DashboardActivity extends AppCompatActivity {
DrawerLayout drawerLayout;
NavigationView navigationView;
Toolbar toolbar;
LinearLayout medicinesButton;
ActionBarDrawerToggle actionBarDrawerToggle;
LinearLayout consultantButton;
LinearLayout blogButton;
LinearLayout doctor1;
LinearLayout doctor2;
LinearLayout doctor3;
LinearLayout doctor4;
LinearLayout doctor5;
ImageView loginImage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        setSupportActionBar(toolbar);

        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        medicinesButton = findViewById(R.id.medicinesButton);
        consultantButton = findViewById(R.id.consultantButton);
        blogButton = findViewById(R.id.blogButton);
        doctor1 = findViewById(R.id.doctor1);
        doctor1 = findViewById(R.id.doctor2);
        doctor1 = findViewById(R.id.doctor3);
        doctor1 = findViewById(R.id.doctor4);
        doctor1 = findViewById(R.id.doctor5);
        loginImage = findViewById(R.id.loginImage);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        medicinesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, MedicineActivity.class));
            }
        });

        consultantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, DoctorActivity.class));
            }
        });

        blogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, BlogsActivity.class));
            }
        });

        doctor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, DoctorActivity.class));
            }
        });

        doctor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, DoctorActivity.class));
            }
        });

        doctor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, DoctorActivity.class));
            }
        });

        doctor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, DoctorActivity.class));
            }
        });

        doctor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, DoctorActivity.class));
            }
        });

        loginImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, LoginActivity.class));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}