package com.zebuild.game;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to UI elements
        Button playButton = findViewById(R.id.btn_play);
        Button shopButton = findViewById(R.id.btn_shop);
        Button settingsButton = findViewById(R.id.btn_settings);
        ImageView logoImageView = findViewById(R.id.logo_image);
        TextView titleTextView = findViewById(R.id.title_text);

        // Set title
        titleTextView.setText("ZeBuild");

        // Play button listener
        playButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GameActivity.class);
            startActivity(intent);
        });

        // Shop button listener
        shopButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ShopActivity.class);
            startActivity(intent);
        });

        // Settings button listener
        settingsButton.setOnClickListener(v -> {
            // Settings implementation
            showSettingsDialog();
        });
    }

    private void showSettingsDialog() {
        // Simple settings dialog
        new androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("Settings")
                .setMessage("Settings:\n- Sound: ON\n- Music: ON")
                .setPositiveButton("Close", null)
                .show();
    }
}
