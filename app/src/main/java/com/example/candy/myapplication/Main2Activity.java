package com.example.candy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("yourName");
        TextView textName = (TextView) findViewById(R.id.textView);
        textName.setText(name);

        String sername = intent.getStringExtra("yourSername");
        TextView textSername = (TextView) findViewById(R.id.textView3);
        textSername.setText(sername);

        String idstu = intent.getStringExtra("idStu");
        TextView textidStu = (TextView) findViewById(R.id.textView4);
        textidStu.setText(idstu);
    }
}
