package com.local.conoce_hervs.utils;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.local.conoce_hervs.db_hervas.DBHervas;

public class UtilidadesDBrutas {

    //Atributos
    private SQLiteDatabase db=null;
    private DBHervas dbhelper=null;
    //Contexto
    Context context;


    public UtilidadesDBrutas(Context contexto){
        this.context=contexto;

        //crea una instancia del helper
        dbhelper=new DBHervas(context);

        //crea un objeto SQLiteDatabase para operar
        //contra la base de datos
        db=dbhelper.getWritableDatabase();

    }
    public void close(){

        dbhelper.close();
    }

    public Cursor listarRutas() {

        return db.query("Rutas", new String[]{"Id", "Nombre", "Tipo", "Distancia", "Duracion", "Dificultad", "Itinerario", "Foto", "Link"},
                null, null, null, null, null);
    }





}
