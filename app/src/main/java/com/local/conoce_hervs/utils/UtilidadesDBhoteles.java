package com.local.conoce_hervs.utils;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.local.conoce_hervs.db_hervas.DBHervas;


public class UtilidadesDBhoteles {

    //Atributos
    private SQLiteDatabase db=null;
    private DBHervas dbhelper=null;
    //Contexto
    Context context;


    public UtilidadesDBhoteles(Context contexto){
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

    public Cursor listarAlojamiento() {
        return db.query("Alojamientos", new String[]{"Id", "Nombre", "Localizacion", "Informacion", "Contacto", "Link", "Imagen"}, null, null, null, null, null);
    }

}
