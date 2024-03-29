package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hangman.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        //fyll på
    }
}
