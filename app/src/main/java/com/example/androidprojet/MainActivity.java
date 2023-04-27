package com.example.androidprojet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//public class MainActivity extends Activity {
//    public Button button;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.welcome_interface);
//        button = (Button) findViewById(R.id.buttonCommencer);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(MainActivity.this,ProfessionActivity.class);
//                startActivity(intent);
//            }
//        });
//
//
//    }
//
//}
public class MainActivity extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_interface);
        button = (Button) findViewById(R.id.buttonCommencer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,ProfessionActivity.class);
//                Intent intent= new Intent(MainActivity.this,IdentificationSmsv2.class);

                startActivity(intent);
            }
        });

    }}