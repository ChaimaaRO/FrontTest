package com.example.androidprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidprojet.model.Eleveur;
import com.example.androidprojet.retrofit.EleveurApi;
import com.example.androidprojet.retrofit.RetrofitService;

import java.util.Random;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class IdentificationEleveur extends AppCompatActivity {
    public Button buttonPrecedent,buttonSuivant;
    private String selectedGender = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identification_eleveur);
        EditText inputNomCompletFr = findViewById(R.id.input_nomComplet_fr);
        EditText inputNomCompletAr = findViewById(R.id.input_nomComplet_ar);
        EditText inputCin = findViewById(R.id.input_cin);
        EditText inputAdress = findViewById(R.id.input_adresse);

        Button buttonFemale = findViewById(R.id.button_female);
        Button buttonMale = findViewById(R.id.button_male);

        buttonSuivant = (Button) findViewById(R.id.bouttonSuivant);
        buttonPrecedent = (Button) findViewById(R.id.precedentBouton);


        buttonFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedGender = "F";
            }
        });

        buttonMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedGender = "M";
            }
        });

//        créer une instance de la classe "RetrofitService" pour  créer une instance de l'interface "EleveurApi"
//        RetrofitService retrofitService = new RetrofitService();
//        EleveurApi eleveurApi = retrofitService.getRetrofit().create(EleveurApi.class);



        buttonPrecedent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(IdentificationEleveur.this,CinActivity.class);
                startActivity(intent);

            }
        });
        buttonSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //extraire les valeurs saisies par l'utilisateur dans les champs de saisie

                String nomCompletFr = inputNomCompletFr.getText().toString();
                String nomCompletAr = inputNomCompletAr.getText().toString();
                String cin = inputCin.getText().toString();
                String adress = inputAdress.getText().toString();

//                String userId = UUID.randomUUID().toString();
//                int idUser = Integer.parseInt(userId);
                Random rand = new Random();
                int idUser = rand.nextInt();
                // creation de l'instance de la classe Eleveur avec les donnees saisie
                Eleveur eleveur = new Eleveur();
                eleveur.setFullNameFr(nomCompletFr);
                eleveur.setFullNameAr(nomCompletAr);
                eleveur.setCin(cin);
                eleveur.setAddress(adress);
                eleveur.setGender(selectedGender);
                eleveur.setBirthdate(null);
                eleveur.setCity(null);
                eleveur.setId(idUser);


                // naviguer vers l'activite suivante et envoyer les donnee collecter de cette activite

                Intent intent= new Intent(IdentificationEleveur.this,IdentificationSmsv2.class);
                intent.putExtra("eleveur", eleveur);
                startActivity(intent);
// envoyer les donneer a l'api


//                eleveurApi.save(eleveur)
//                        .enqueue(new Callback<Eleveur>() {
//                            @Override
//                            public void onResponse(Call<Eleveur> call, Response<Eleveur> response) {
//                                Toast.makeText(IdentificationEleveur.this, "Save successful!", Toast.LENGTH_SHORT).show();
//                            }
//
//                            @Override
//                            public void onFailure(Call<Eleveur> call, Throwable t) {
//                                Toast.makeText(IdentificationEleveur.this, "Save failed!!!", Toast.LENGTH_SHORT).show();
//                                Logger.getLogger(IdentificationEleveur
//                                        .class.getName()).log(Level.SEVERE, "Error occurred", t);
//                            }
//                        });
                // naviguer vers l'activite suivante
//                Intent intent= new Intent(IdentificationEleveur.this,IdentificationSmsv2.class);
//                startActivity(intent);

            }
        });

    }






}