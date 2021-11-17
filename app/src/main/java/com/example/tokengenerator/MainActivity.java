package com.example.tokengenerator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mensajeTextView;
    //TextView mensajeTextView = findViewById(R.id.Cuadrotexto2);
    EditText mensajeEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_token_generator);

    }

    public void intap(View view) {
        Intent myIntent = new Intent(this, Generate_Token.class);
        startActivity(myIntent);
    }


    public void click(View view) {
        Intent agregarIntent = new Intent(this, Add_New_Token_Name.class);
        startActivity(agregarIntent);
    }




}