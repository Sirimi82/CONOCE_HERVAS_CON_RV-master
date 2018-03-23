package com.local.conoce_hervs.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.local.conoce_hervs.R;

public class Informacion extends Fragment {

    //Creamos el constructor de la clase (se utiliza en el switch del main)
    public Informacion() {

    }


    //Creamos fragment de dicha clase para poder nombrarlo en el main
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.info_layout, container, false);

        TextView tv = (TextView) view.findViewById(R.id.textViewInfo);
        tv.setMovementMethod(new ScrollingMovementMethod());

        // Devolvemos la vista al fragment
        return view;

    }


}
