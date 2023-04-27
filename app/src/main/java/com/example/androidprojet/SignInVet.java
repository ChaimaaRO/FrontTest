package com.example.androidprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidprojet.databinding.ActivitySignInVetBinding;

public class SignInVet extends AppCompatActivity {
    public Button signUpButton;
    private ActivitySignInVetBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_vet);

        signUpButton = (Button) findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInVet.this, InscriptionVet.class);
                startActivity(intent);
            }
        });
    }

    public void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

    }

    private void signIn() {
        //TODO: Connect to a firebase !!

    }

//    private Boolean isValidSignInDetails() {
//        if (binding.inputEmail.getText().toString().trim().isEmpty()) {
//            showToast("Entrer un email");
//            return false;
//        } else if (!Patterns.EMAIL_ADDRESS.matcher(binding.inputEmail.getText().toString()).matches()) {
//            showToast("Entrer un email valide");
//            return false;
//        } else if (binding.inputPassword.getText().toString().trim().isEmpty()) {
//            showToast("Entrer un mot de passe");
//            return false;
//
//        } else {
//            return true;
//        }
//    }

    private void loading(Boolean isLoading) {
        if (isLoading) {
            binding.signInButton.setVisibility(View.INVISIBLE);
            binding.progressBar.setVisibility(View.VISIBLE);
        } else {
            binding.signInButton.setVisibility(View.VISIBLE);
            binding.progressBar.setVisibility(View.INVISIBLE);
        }
    }

}