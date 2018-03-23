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
import com.local.conoce_hervs.fragments.VistasDetalle.FragmentDetalleBares;
import com.local.conoce_hervs.fragments.VistasDetalle.FragmentDetalleHoteles;
import com.local.conoce_hervs.model.ModelAlojamiento;
import com.local.conoce_hervs.model.ModelBares;
import com.local.conoce_hervs.utils.UtilidadesDBbares;
import com.local.conoce_hervs.fragments.interfazClickListener.RecyclerViewClickListener;
import com.local.conoce_hervs.rv_bares.AdaptadorBares;


import java.util.ArrayList;
import java.util.List;

public class Restauracion extends Fragment implements RecyclerViewClickListener {

    List<ModelBares> bares  = new ArrayList<>();
    RecyclerView rv;
    AdaptadorBares adapter;

    public Restauracion(){
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.restauracion_layout, container, false);


        rv = view.findViewById(R.id.RVbares);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);



        rellenaAdbares(rv);

        // Devolvemos la vista al fragment
        return view;

    }


    public void rellenaAdbares(RecyclerView rv){


       UtilidadesDBbares listaBares = new UtilidadesDBbares(getActivity());
        Cursor cur = listaBares.listarBares();


            if (cur.moveToFirst()) {
                do {
                    bares.add( new ModelBares(cur.getString(1), cur.getString(2),
                            cur.getString(3), cur.getString(4),cur.getString(5)));
                } while (cur.moveToNext());
            }



        adapter = new AdaptadorBares(bares, getActivity(), this);
        rv.setAdapter(adapter);

        listaBares.close();


    }

    @Override
    public View recyclerViewListClicked(View v, int position) {
        bares.get(position);
        ModelBares restauracion = (ModelBares) bares.get(position);
        FragmentDetalleBares detallebares = new FragmentDetalleBares();
        Bundle bundle = new Bundle();
        bundle.putParcelable("posicion", (Parcelable) restauracion);
        detallebares.setArguments(bundle);
        FragmentManager manager = getFragmentManager();
        manager.beginTransaction().replace(R.id.vacio, detallebares).addToBackStack(null).commit();
        return v;

    }
}