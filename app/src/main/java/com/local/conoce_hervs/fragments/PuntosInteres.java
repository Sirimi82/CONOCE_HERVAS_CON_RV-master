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
import com.local.conoce_hervs.fragments.VistasDetalle.FragmentDetalleInteres;
import com.local.conoce_hervs.model.ModelPuntos;

import com.local.conoce_hervs.utils.UtilidadesDBpuntos;
import com.local.conoce_hervs.fragments.interfazClickListener.RecyclerViewClickListener;
import com.local.conoce_hervs.rv_puntosinteres.AdaptadorInteres;


import java.util.ArrayList;
import java.util.List;


public class PuntosInteres extends Fragment implements RecyclerViewClickListener{

    List<ModelPuntos> puntosList  = new ArrayList<>();
    RecyclerView rv;
    AdaptadorInteres adapter;

    public PuntosInteres(){
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.puntosinteres_layout, container, false);


        rv = view.findViewById(R.id.RVinteres);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);


        rellenaAdPuntos(rv);

        // Devolvemos la vista al fragment
        return view;

    }


    public void rellenaAdPuntos(RecyclerView rv){

        UtilidadesDBpuntos listaPuntosInt = new UtilidadesDBpuntos(getActivity());
        Cursor cur = listaPuntosInt.listarPuntos();


            if (cur.moveToFirst()) {
                do {
                    puntosList.add( new ModelPuntos(cur.getString(1), cur.getString(2), cur.getString(3), cur.getString(4),cur.getString(5)));
                } while (cur.moveToNext());
            }


        adapter = new AdaptadorInteres(puntosList,getActivity(), this);
        rv.setAdapter(adapter);

        listaPuntosInt.close();


    }

    @Override
    public View recyclerViewListClicked(View v, int position) {
        puntosList.get(position);
        ModelPuntos puntosInt = (ModelPuntos) puntosList.get(position);
        FragmentDetalleInteres detalleInt = new FragmentDetalleInteres();
        Bundle bundle = new Bundle();
        bundle.putParcelable("posicion", (Parcelable) puntosInt);
        detalleInt.setArguments(bundle);
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction().replace(R.id.vacio, detalleInt).addToBackStack(null).commit();
        return v;
    }
}