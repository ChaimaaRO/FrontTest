package com.example.androidprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.androidprojet.model.Eleveur;

import java.io.IOException;

public class IdentificationSmsv2 extends AppCompatActivity {
  public Button buttonSuivant, buttonPrecedent;
  private EditText input_numero ;
  private Eleveur eleveur ;
  private String imagePath = null;
  private static final int PICK_IMAGE_REQUEST = 1;
    private ImageButton buttonimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification_smsv2);

        buttonSuivant = (Button) findViewById(R.id.bouttonSuivant);
        buttonPrecedent = (Button) findViewById(R.id.precedentBouton);
        input_numero = findViewById(R.id.input_numero);


        // acces a la galerie
        buttonimage = findViewById(R.id.photoButton);

        buttonimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Créer une intention pour ouvrir la galerie de photos
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, PICK_IMAGE_REQUEST);
            }
        });














        // Récupérer l'objet Eleveur de l'intention
        eleveur = (Eleveur) getIntent().getSerializableExtra("eleveur");




        buttonSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numero = input_numero.getText().toString();

                // definir le numero de l'eleveur
                eleveur.setPhoneNumber(numero);
                eleveur.setProfile(imagePath);
//                Intent intent= new Intent(IdentificationSmsv2.this,SmsVerify.class);
               Intent intent= new Intent(IdentificationSmsv2.this,Pwdactivity.class);
                intent.putExtra("eleveur", eleveur);
                startActivity(intent);
            }
        });

        buttonPrecedent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(IdentificationSmsv2.this,IdentificationEleveur.class);
                startActivity(intent);
            }
        });
    }
    // Recevoir les résultats de l'intention pour sélectionner une photo
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            // Récupérer l'URI de l'image sélectionnée dans la galerie
            Uri uri = data.getData();

            try {
                // Convertir l'URI en un objet Bitmap
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);

                // Enregistrer le chemin d'accès de l'image dans la variable imagePath
                imagePath = uri.getPath();

                // Afficher l'image sélectionnée dans le ImageButton
                buttonimage.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}