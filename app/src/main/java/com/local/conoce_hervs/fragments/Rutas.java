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
import com.local.conoce_hervs.fragments.VistasDetalle.FragmentDetalleRutas;
import com.local.conoce_hervs.model.ModelRutas;
import com.local.conoce_hervs.utils.UtilidadesDBrutas;

import com.local.conoce_hervs.fragments.interfazClickListener.RecyclerViewClickListener;
import com.local.conoce_hervs.rv_rutas.AdaptadorRutas;


import java.util.ArrayList;
import java.util.List;


public class Rutas extends Fragment implements RecyclerViewClickListener {

    List<ModelRutas> ruts  = new ArrayList<>();
    RecyclerView rv;
    AdaptadorRutas adapter;

    public Rutas(){
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.rutas_layout, container, false);


        rv = view.findViewById(R.id.RVRutas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);


        rellenaAdrutas(rv);

        // Devolvemos la vista al fragment
        return view;

    }


    public void rellenaAdrutas(RecyclerView rv){

      UtilidadesDBrutas listaRutas = new UtilidadesDBrutas(getActivity());
        Cursor cur = listaRutas.listarRutas();


            if (cur.moveToFirst()) {
                do {
                    ruts.add( new ModelRutas(cur.getString(1), cur.getString(2), cur.getString(3),
                            cur.getString(4), cur.getString(5), cur.getString(6), cur.getString(7), cur.getString(8)));
                } while (cur.moveToNext());
            }



        adapter = new AdaptadorRutas(ruts, getActivity(), this);
        rv.setAdapter(adapter);

        listaRutas.close();


    }

    @Override
    public View recyclerViewListClicked(View v, int position) {
        ruts.get(position);
        ModelRutas rutas = (ModelRutas) ruts.get(position);
        FragmentDetalleRutas detalle = new FragmentDetalleRutas();
        Bundle bundle = new Bundle();
        bundle.putParcelable("posicion", (Parcelable) rutas);
        detalle.setArguments(bundle);
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction().replace(R.id.vacio, detalle).addToBackStack(null).commit();
        return v;

    }
}