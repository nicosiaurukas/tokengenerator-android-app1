package com.example.tokengenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Add_New_Token_Name extends AppCompatActivity {
    //1 Crear el objeto editText en el cual escribiremos el texto

    EditText entrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_token_name);

        //2 Instanciar el objeto
        entrada = (EditText) findViewById(R.id.editTextView);
    }


    public void guardarEnBbDd(View View) {
        //Crear y guardar en una variable String lo que el usuario ingrese en la entrada
        String nombreUsuario = entrada.getText().toString();

        //Instanciar la base de datos
        BaseDatosToken miBaseDatos = new BaseDatosToken(this, "BBDDapi", null, 1);

        //Abrimos la base de datos #intentamos
        try (SQLiteDatabase BBDD = miBaseDatos.getWritableDatabase()) {
            //Creamos un registro
            ContentValues registro = new ContentValues();
            //ponemos en el campo user name de la bbdd lo que el usuario ingresa en la entrada
            registro.put("USER_NAME", nombreUsuario);
            //Insertamos en la base de datos
            BBDD.insert("USER_TOKEN_NAME", null, registro);

            //Dejamos vacia la entrada
            entrada.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}