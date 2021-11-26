package com.example.tokengenerator;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

//con extend llamo a una herencia para el objeto o clase  basedatostoken, heredamos sqliteopenhelper- > se heredan todos los metodos y atributos

public class BaseDatosToken extends SQLiteOpenHelper {

    //es un metodo constructor que va a ejecutarse a partir de mi clase BaseDtosToken
    //El constructor lleva el mismo nombre que la clase
    public BaseDatosToken(@Nullable Context contexto, @Nullable String nombre, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(contexto, nombre, factory, version);
        //heredo los metodos que recien use

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table USER_TOKEN_NAME(USER_NAME text(30) not null primary key)");

        sqLiteDatabase.execSQL("create table USER_TOKEN_CODE(TOKEN_NAME_ID text(30) not null) , TOKEN_CODE text(64)" +
                ", not null , FOREIGN KEY(TOKEN_NAME_ID) REFERENCES USER_TOKEN_NAME(USER_NAME))");

        //sqLiteDatabase.execSQL("create table USER_TOKEN_CODE(TOKEN_NAME_ID text(30) not null) , " +
        //                "TOKEN_CODE text(64) not null , FOREIGN KEY(TOKEN_NAME_ID) " +
        //                "REFERENCES USER_TOKEN_NAME(USER_NAME))");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
