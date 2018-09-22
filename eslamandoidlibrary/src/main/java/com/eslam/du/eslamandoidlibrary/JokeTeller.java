package com.eslam.du.eslamandoidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeTeller extends AppCompatActivity {
    public static final String JOKE = "joke";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_teller);

        Intent mIntent=getIntent();
        String Joke= mIntent.getStringExtra(JOKE);
        TextView mTextView= (TextView) findViewById(R.id.tv_activity);
        mTextView.setText(String.valueOf(Joke));


    }
}
