package com.example.androidprojet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Attachs1 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attachs1);

//        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
//        bottomNav.setOnNavigationItemSelectedListener(navListener);
//
//        //I added this if statement to keep the selected fragment when rotating the device
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                    new HomeFragment()).commit();
//        }}
//    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
//            new BottomNavigationView.OnNavigationItemSelectedListener() {
//                @Override
//                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                    Fragment selectedFragment = null;
//
//                    switch (item.getItemId()) {
//                        case R.id.nav_home:
//                            selectedFragment = new HomeFragment();
//                            break;
//                        case R.id.nav_favorites:
//                            selectedFragment = new NotifFragment();
//                            break;
//                        case R.id.nav_search:
//                            selectedFragment = new MessageFragment();
//                            break;
//                    }
//
//                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
//                            selectedFragment).commit();
//
//                    return true;
//                }
//            };
}}