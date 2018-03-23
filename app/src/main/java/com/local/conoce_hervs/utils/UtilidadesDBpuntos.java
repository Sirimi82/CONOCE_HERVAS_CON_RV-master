package com.local.conoce_hervs.utils;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.local.conoce_hervs.db_hervas.DBHervas;


public class UtilidadesDBpuntos {


    //Atributos
    private SQLiteDatabase db=null;
    private DBHervas dbhelper= null;
    //Contexto
    Context context;


    public UtilidadesDBpuntos(Context contexto){
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

    public Cursor listarPuntos() {
        return db.query("PuntosInteres", new String[]{"Id", "Nombre", "Lat", "Lng", "Descripcion", "Foto"},
                null, null, null, null, null);
    }




}
