package com.example.safetouch;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class CallsActivity extends AppCompatActivity {

    private ImageButton goToSettings;
    private ImageButton goToMain;
    private ImageButton goToMaps;
    private ImageButton goToCalls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calls);

        goToCalls = findViewById(R.id.button_calls);
        goToMain = findViewById(R.id.button_main);
        goToMaps = findViewById(R.id.button_maps);
        goToSettings = findViewById(R.id.button_settings);

        goToMain.setOnClickListener(V->{
            Intent i = new Intent(CallsActivity.this, MainActivity.class);
            startActivity(i);
        });

        goToCalls.setOnClickListener(V->{
            Intent i = new Intent(CallsActivity.this, CallsActivity.class);
            startActivity(i);
        });
        goToSettings.setOnClickListener(V->{
            Intent i = new Intent(CallsActivity.this, SettingsActivity.class);
            startActivity(i);
        });

        goToMaps.setOnClickListener(V->{
            Intent i = new Intent(CallsActivity.this, MapsActivity.class);
            startActivity(i);
        });
    }
}