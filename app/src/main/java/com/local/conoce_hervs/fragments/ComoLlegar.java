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


public class ComoLlegar extends Fragment {

    public ComoLlegar() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.llegar_layout, container, false);
        TextView tv = (TextView) view.findViewById(R.id.textViewMapa);
        tv.setMovementMethod(new ScrollingMovementMethod());

        // Devolvemos la vista al fragment
        return view;

    }
}