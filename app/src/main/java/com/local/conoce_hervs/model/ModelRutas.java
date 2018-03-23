package com.local.conoce_hervs.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class ModelRutas  extends ArrayList<Parcelable> implements Parcelable{

 private String nombre;
 private String tipo;
 private String distancia;
 private String duracion;
 private String dificultad;
 private String itinerario;
 private String foto;
 private String link;

    public ModelRutas(String nombre, String tipo, String distancia, String duracion, String dificultad, String itinerario, String foto, String link) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.link=link;
        this.distancia = distancia;
        this.duracion = duracion;
        this.dificultad = dificultad;
        this.itinerario = itinerario;
        this.foto = foto;
    }

    protected ModelRutas(Parcel in) {
        nombre = in.readString();
        tipo = in.readString();
        distancia = in.readString();
        duracion = in.readString();
        dificultad = in.readString();
        itinerario = in.readString();
        foto = in.readString();
        link = in.readString();
    }

    public static final Creator<ModelRutas> CREATOR = new Creator<ModelRutas>() {
        @Override
        public ModelRutas createFromParcel(Parcel in) {
            return new ModelRutas(in);
        }

        @Override
        public ModelRutas[] newArray(int size) {
            return new ModelRutas[size];
        }
    };

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public static Creator<ModelRutas> getCREATOR() {
        return CREATOR;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }

    public String getFoto() {return foto;}

    public void setFoto(String foto) {this.foto = foto;}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(tipo);
        dest.writeString(distancia);
        dest.writeString(duracion);
        dest.writeString(dificultad);
        dest.writeString(itinerario);
        dest.writeString(foto);
        dest.writeString(link);
    }
}
