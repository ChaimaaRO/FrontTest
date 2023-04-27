package com.example.androidprojet;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CinActivity extends AppCompatActivity {

    public Button precedentButton;
    public ImageButton cameraButton;
    public Button suivantButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cin);

        precedentButton=(Button)findViewById(R.id.precedentBouton);
        precedentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CinActivity.this,ProfessionActivity.class);
                startActivity(intent);
            }
        });

        cameraButton=(ImageButton) findViewById(R.id.cameraButton);
        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cameraIntent=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(cameraIntent);
            }
        });

        suivantButton=(Button)findViewById(R.id.bouttonSuivant);
        suivantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CinActivity.this,IdentificationEleveur.class);
                startActivity(intent);
            }
        });





    }
}