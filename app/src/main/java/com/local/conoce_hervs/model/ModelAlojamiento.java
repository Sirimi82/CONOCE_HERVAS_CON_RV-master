package com.local.conoce_hervs.model;


import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class ModelAlojamiento extends ArrayList<Parcelable> implements Parcelable{

    private String nombre;
    private String localizacion;
    private String informacion;
    private String contacto;
    private String link;
    private String imagen;

    public ModelAlojamiento(String nombre, String localizacion, String informacion, String contacto, String link, String imagen) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.informacion = informacion;
        this.contacto = contacto;
        this.link = link;
        this.imagen = imagen;
    }

    protected ModelAlojamiento(Parcel in) {
        nombre = in.readString();
        localizacion = in.readString();
        informacion = in.readString();
        contacto = in.readString();
        link = in.readString();
        imagen = in.readString();
    }

    public static final Creator<ModelAlojamiento> CREATOR = new Creator<ModelAlojamiento>() {

        @Override
        public ModelAlojamiento createFromParcel(Parcel in) {
            return new ModelAlojamiento(in);
        }

        @Override
        public ModelAlojamiento[] newArray(int size) {

            return new ModelAlojamiento[size];
        }
    };

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
        parcel.writeString(link);
        parcel.writeString(localizacion);
        parcel.writeString(informacion);
        parcel.writeString(contacto);
        parcel.writeString(imagen);

    }
}
