package com.focals.jokescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        //  Initialize Joke TextView
        jokeTextView = findViewById(R.id.tv_joke);

        // Get Joke from Intent
        String joke = getIntent().getStringExtra("JOKE");
        jokeTextView.setText(joke);
    }
}
