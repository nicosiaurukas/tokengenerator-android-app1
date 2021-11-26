package com.example.tokengenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Random;


public class Generate_Token extends AppCompatActivity {

    //TextView mensajeTextView;
    //EditText mensajeEditText;

    //Objeto textView para ser asignado al textview del layout -> lo llamamos t1

    TextView t1;


    //private TextView t1;
    private static final SecureRandom secureRandom = new SecureRandom(); //threadsafe
    private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder(); //threadsafe

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_token);

        //Opciones para que inicialice el objeto
        //t1=findViewById(R.id.textView2);  -> este mio anda bien, el de abajo es el que pasaron #dice lo mismo pero distinta forma #

        t1 = (TextView) findViewById(R.id.textView2);
    }


    private String caracteresPermitidos = "123456789abcdefghijklmniopqrstuvwxyz#$%&";

    //2 Generar codigo aleatorio a partir de caracteres permitidos
    public String generarCodigoAleatorio(final int tamanoCodigo){
        Random aleatorio = new Random();

        StringBuilder stb = new StringBuilder(tamanoCodigo);

        for (int i=0; i < tamanoCodigo; i++){
            stb.append(caracteresPermitidos.charAt(aleatorio.nextInt(caracteresPermitidos.length())));
            //stb.append(caracteresPermitidos.charAt(aleatorio.nextInt(64)));
        }
        return stb.toString();
    }

    public void buttonPress(View view) {
        t1.setText(generarCodigoAleatorio(64));
    }

}


