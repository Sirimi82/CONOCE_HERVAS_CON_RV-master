package com.local.conoce_hervs.model;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class ModelBares extends ArrayList<Parcelable> implements Parcelable {

    private String nombre;
    private String descripcion;
    private String localizacion;
    private String link;
    private String foto;

    public ModelBares(String nombre, String descripcion, String localizacion, String link, String foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.localizacion = localizacion;
        this.link = link;
        this.foto = foto;
    }

    protected ModelBares(Parcel in) {
        nombre = in.readString();
        descripcion = in.readString();
        localizacion = in.readString();
        link = in.readString();
        foto = in.readString();
    }

    public static final Creator<ModelBares> CREATOR = new Creator<ModelBares>() {
        @Override
        public ModelBares createFromParcel(Parcel in) {
            return new ModelBares(in);
        }

        @Override
        public ModelBares[] newArray(int size) {
            return new ModelBares[size];
        }
    };

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(nombre);
        parcel.writeString(descripcion);
        parcel.writeString(localizacion);
        parcel.writeString(link);
        parcel.writeString(foto);
    }
}
