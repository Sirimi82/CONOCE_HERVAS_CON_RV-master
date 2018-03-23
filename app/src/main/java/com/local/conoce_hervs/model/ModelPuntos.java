package com.local.conoce_hervs.model;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.android.gms.maps.model.LatLngBounds;

import java.util.ArrayList;

public class ModelPuntos extends ArrayList<Parcelable> implements Parcelable {

    private String nombre;
    private String descripcion;
    private String Lat;
    private String Lng;
    private String foto;

    public ModelPuntos(String nombre, String Lat, String Lng, String descripcion, String foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Lat = Lat;
        this.Lng= Lng;
        this.foto = foto;
    }

    protected ModelPuntos(Parcel in) {
        nombre = in.readString();
        descripcion = in.readString();
        Lat = in.readString();
        Lng = in.readString();
        foto = in.readString();
    }

    public static final Creator<ModelPuntos> CREATOR = new Creator<ModelPuntos>() {
        @Override
        public ModelPuntos createFromParcel(Parcel in) {
            return new ModelPuntos(in);
        }

        @Override
        public ModelPuntos[] newArray(int size) {
            return new ModelPuntos[size];
        }
    };

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLng() {
        return Lng;
    }

    public void setLng(String lng) {
        Lng = lng;
    }

    public static Creator<ModelPuntos> getCREATOR() {
        return CREATOR;
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {



            parcel.writeString(nombre);
            parcel.writeString(descripcion);
            parcel.writeString(Lat);
            parcel.writeString(Lng);
            parcel.writeString(foto);


    }
}
