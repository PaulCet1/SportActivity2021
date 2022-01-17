package com.sportactivity.example;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class menu_activity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().hide();

        Button licznik_krokow = findViewById(R.id.licznik_krokow);
        Button maps = findViewById(R.id.button_mapa);


        FloatingActionButton set1 = findViewById(R.id.sett_1);
        FloatingActionButton set2 = findViewById(R.id.sett_2);
        FloatingActionButton set3 = findViewById(R.id.sett_3);
        FloatingActionButton set4 = findViewById(R.id.sett_4);


        licznik_krokow.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Funkcja licznik kroków", Toast.LENGTH_SHORT).show();

            openstepcounter();






        });


        maps.setOnClickListener(v -> {Toast.makeText(getApplicationContext(), "Mapa!", Toast.LENGTH_SHORT).show();

            openmap();

        });


        set1.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Funkcja telefon", Toast.LENGTH_SHORT).show();
            opentelephone();

        });
        set2.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Funkcja aparat", Toast.LENGTH_SHORT).show();
            openCamera();

        });
        set3.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Odtwarzacz muzyki", Toast.LENGTH_SHORT).show();
            openAudioPlayer();

        });
        set4.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Przeglądarka internetowa", Toast.LENGTH_SHORT).show();
            openbrowser();

        });





    }
    private void openstepcounter() {
        Intent stepcounteropen = new Intent(this, MainActivity.class);
        startActivity(stepcounteropen);

    }
    public void opentraining(){
        Intent intenttraining = new Intent(this, biometriclock.class);
        startActivity(intenttraining);
    }

    public void openmap(){
        Intent intentmap = new Intent(this, mapactivity.class);
        startActivity(intentmap);
    }



    private void openbrowser() {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.google.com")));
    }

    private void openAudioPlayer() {
        Intent playerIntent = new Intent(Intent.ACTION_VIEW);
        playerIntent.setData(Uri.parse("spotify:library"));
        startActivity(playerIntent);
    }

    private void opentelephone() {
        Intent callintent = new Intent(Intent.ACTION_DIAL);
        startActivity(callintent);

    }

    private void openCamera() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }




}
