package com.example.androidprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InscriptionVet extends AppCompatActivity {
    public Button singInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription_vet);
        singInButton=(Button) findViewById(R.id.signInButton);
        singInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(InscriptionVet.this,SignInVet.class);
                startActivity(intent);
            }
        });




    }
}