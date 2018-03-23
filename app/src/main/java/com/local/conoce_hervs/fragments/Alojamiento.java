package com.local.conoce_hervs.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.local.conoce_hervs.R;

import com.local.conoce_hervs.fragments.VistasDetalle.FragmentDetalleHoteles;
import com.local.conoce_hervs.model.ModelAlojamiento;
import com.local.conoce_hervs.utils.UtilidadesDBhoteles;
import com.local.conoce_hervs.fragments.interfazClickListener.RecyclerViewClickListener;
import com.local.conoce_hervs.rv_hoteles.AdaptadorHotel;


import java.util.ArrayList;
import java.util.List;

public class Alojamiento extends Fragment implements RecyclerViewClickListener {


    //Declaramos variables

    List<ModelAlojamiento> hotels = new ArrayList<>();
    RecyclerView rv;
    AdaptadorHotel adapter;

    public Alojamiento() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.alojamiento_layout, container, false);


        rv = view.findViewById(R.id.RVHoteles);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);


        rellenaAdhoteles(rv);

        // Devolvemos la vista al fragment
        return view;

    }


    public void rellenaAdhoteles(RecyclerView rv) {

        UtilidadesDBhoteles listaHoteles = new UtilidadesDBhoteles(getActivity());
        Cursor cur = listaHoteles.listarAlojamiento();


        if (cur.moveToFirst()) {
            do {
                hotels.add(new ModelAlojamiento(cur.getString(1), cur.getString(2), cur.getString(3), cur.getString(4),
                        cur.getString(5), cur.getString(6)));
            } while (cur.moveToNext());
        }


        adapter = new AdaptadorHotel(hotels, getActivity(), this);
        rv.setAdapter(adapter);

        listaHoteles.close();


    }

    @Override
    public View recyclerViewListClicked(View v, int position) {

        hotels.get(position);
        ModelAlojamiento alojamiento = (ModelAlojamiento) hotels.get(position);
        FragmentDetalleHoteles detalle = new FragmentDetalleHoteles();
        Bundle bundle = new Bundle();
        bundle.putParcelable("posicion", (Parcelable) alojamiento);
        detalle.setArguments(bundle);
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction().replace(R.id.vacio, detalle).addToBackStack(null).commit();
        return v;

    }
}