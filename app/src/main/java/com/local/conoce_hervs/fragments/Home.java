package com.local.conoce_hervs.fragments;



import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.local.conoce_hervs.R;

public class Home extends Fragment {

TextView textViewHola;

    public Home() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.content_main, container, false);
        
        // Devolvemos la vista al fragment
        return view;

    }
}
