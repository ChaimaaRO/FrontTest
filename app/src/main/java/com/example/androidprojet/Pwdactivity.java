package com.example.androidprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidprojet.model.Eleveur;
import com.example.androidprojet.retrofit.EleveurApi;
import com.example.androidprojet.retrofit.RetrofitService;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Pwdactivity extends AppCompatActivity {
    public Button buttonEnregistrer;
    private EditText pwd_input ;

    private Eleveur eleveur;
TextView textView ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pwdactivity);
        buttonEnregistrer = (Button) findViewById(R.id.enregistrerButton);
        pwd_input=findViewById(R.id.pwd_input);

        // Récupérer l'objet Eleveur de l'intention
        eleveur = (Eleveur) getIntent().getSerializableExtra("eleveur");


        //        créer une instance de la classe "RetrofitService" pour  créer une instance de l'interface "EleveurApi"
        RetrofitService retrofitService = new RetrofitService();
        EleveurApi eleveurApi = retrofitService.getRetrofit().create(EleveurApi.class);
        buttonEnregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pwd = pwd_input.getText().toString();
                eleveur.setPassword(pwd);

                Intent intent= new Intent(Pwdactivity.this,Attachs1.class);
                startActivity(intent);




                //envoyer les donnees a l'API
                eleveurApi.save(eleveur)
                        .enqueue(new Callback<Eleveur>() {
                           @Override
                           public void onResponse(Call<Eleveur> call, Response<Eleveur> response) {
                                Toast.makeText(Pwdactivity.this, "Save successful!", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onFailure(Call<Eleveur> call, Throwable t) {
                                Toast.makeText(Pwdactivity.this, "Save failed!!!", Toast.LENGTH_SHORT).show();
                                Logger.getLogger(IdentificationEleveur
                                        .class.getName()).log(Level.SEVERE, "Error occurred", t);
                            }
                        });
            }
        });


    }
}