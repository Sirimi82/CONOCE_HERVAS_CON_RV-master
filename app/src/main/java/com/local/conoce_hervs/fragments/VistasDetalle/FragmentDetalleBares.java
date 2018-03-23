package com.local.conoce_hervs.fragments.VistasDetalle;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.local.conoce_hervs.R;
import com.local.conoce_hervs.model.ModelBares;
import com.local.conoce_hervs.model.ModelPuntos;
import com.local.conoce_hervs.picasso.PicassoCache;

public class FragmentDetalleBares extends android.app.Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_detalle_bares, container, false);
        Bundle bundle = getArguments();
        ModelBares bares;
        ConstraintLayout constraintLayout = new ConstraintLayout(getActivity());


        if (bundle != null) {
            bares = bundle.getParcelable("posicion");
            String nombrebar, descripcionbar, localizacionbar, linkbar, fotobar;
            nombrebar=bares.getNombre().toString();
            descripcionbar=bares.getDescripcion().toString();
            localizacionbar=bares.getLocalizacion().toString();
            linkbar=bares.getLink().toString();
            fotobar=bares.getFoto().toString();
            TextView nombreBar = v.findViewById(R.id.nombre_bares);
            TextView localizacionBar = v.findViewById(R.id.local_bares);
            TextView descripcionBar = v.findViewById(R.id.info_bares);
            TextView linkBar = v.findViewById(R.id.link_bares);
            ImageView fotoBar=v.findViewById(R.id.imagen_bares);
            nombreBar.setText(nombrebar);
            localizacionBar.setText(localizacionbar);
            descripcionBar.setText(descripcionbar);
            linkBar.setText(linkbar);
            PicassoCache.getPicassoInstance(this.getActivity()).load(fotobar)
                    .resize(450, 300)
                    .into(fotoBar);
        }

        return v;


    }

}
