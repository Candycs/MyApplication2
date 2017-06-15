package com.example.candy.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String yourName;
    String yourSername;
    String idStu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendData(View view) {
        EditText editTextName = (EditText) findViewById(R.id.yourName);
        yourName = editTextName.getText().toString();

        EditText editTextSername = (EditText) findViewById(R.id.yourSername);
        yourSername = editTextSername.getText().toString();

        EditText editTextIdStu = (EditText) findViewById(R.id.idStu);
        idStu = editTextIdStu.getText().toString();

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("yourName", yourName);
        intent.putExtra("yourSername", yourSername);
        intent.putExtra("idStu", idStu);
        startActivity(intent);
    }
}
