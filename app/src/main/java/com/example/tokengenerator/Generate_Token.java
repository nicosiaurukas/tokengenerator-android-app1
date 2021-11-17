package com.example.tokengenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.security.SecureRandom;
import java.util.Base64;


public class Generate_Token extends AppCompatActivity {

    //TextView mensajeTextView;
    //EditText mensajeEditText;

    private TextView t1;
    private static final SecureRandom secureRandom = new SecureRandom(); //threadsafe
    private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder(); //threadsafe

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_token);
        t1=findViewById(R.id.textView2);
    }


    public void buttonPress(View view) {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        String token = bytes.toString();
        t1.setText(token+"");


    }
}


