package com.example.mohammadhasan.hatapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void browser1(View view){
    Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/Hatman42/HatApp"));
    startActivity(browserIntent);
}
}
