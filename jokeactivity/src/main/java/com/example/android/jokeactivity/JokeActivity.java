package com.example.android.jokeactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static final String JOKE_EXTRA = "JokeSendedThroughIntent";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

          String getJoke = this.getIntent().getStringExtra(JOKE_EXTRA);
          if (!getJoke.isEmpty() || getJoke!=null)
        {
            TextView mJokeTextView = findViewById(R.id.jokesTextView);
            mJokeTextView.setText(getJoke);
        }
    }
}
