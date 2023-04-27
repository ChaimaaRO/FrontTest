package com.example.androidprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ProfessionActivity extends AppCompatActivity {
    public ImageButton buttonEleveur;
    public ImageButton buttonVet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profession);
        buttonEleveur =(ImageButton) findViewById(R.id.eleveurButton);
        buttonEleveur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ProfessionActivity.this,CinActivity.class);
                startActivity(intent);
            }
        });

        buttonVet=(ImageButton) findViewById(R.id.vetButton);
        buttonVet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(ProfessionActivity.this,InscriptionVet.class);
                startActivity(intent);
            }
        });






    }
}