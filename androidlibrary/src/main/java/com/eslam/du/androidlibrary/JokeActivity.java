package com.eslam.du.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class JokeActivity extends AppCompatActivity {

    public static final String Joke_KEY="Joke_Key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent=getIntent();

        if(intent.getExtras() != null){

            String Joke=intent.getStringExtra(Joke_KEY);
            TextView textView=findViewById(R.id.JokeTextView);

            textView.setText(Joke);

        }



    }
}
