package com.local.conoce_hervs.fragments.VistasDetalle;


import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;

import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.MapFragment;
import com.local.conoce_hervs.MapsActivity;
import com.local.conoce_hervs.Maps_activity;
import com.local.conoce_hervs.R;
import com.local.conoce_hervs.model.ModelPuntos;
import com.local.conoce_hervs.picasso.PicassoCache;

public class FragmentDetalleInteres extends android.app.Fragment {
    ModelPuntos puntosInteres;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_detalle_interes, container, false);
        final Bundle bundle = getArguments();

        final ConstraintLayout constraintLayout = new ConstraintLayout(getActivity());

        if (bundle != null) {
            puntosInteres = bundle.getParcelable("posicion");
            String nombre, mapa, descripcion, foto;
            nombre = puntosInteres.getNombre().toString();
            descripcion = puntosInteres.getDescripcion().toString();
            //mapa=puntosInteres.getMapa().toString();
            foto = puntosInteres.getFoto().toString();
            TextView nombreInteres = v.findViewById(R.id.nombre_interes);
            TextView infoInteres = v.findViewById(R.id.info_interes);
            TextView tvmapa = v.findViewById(R.id.tvMapa);
            ImageView fotoInteres = v.findViewById(R.id.foto_interes);
            nombreInteres.setText(nombre);
            //mapaInteres.setText(mapa);
            infoInteres.setText(descripcion);
            PicassoCache.getPicassoInstance(this.getActivity()).load(foto)
                    .resize(450, 300)
                    .into(fotoInteres);
            tvmapa.setText("Ver en el mapa");
            tvmapa.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                 //   ModelPuntos interes = (ModelPuntos) puntosInteres;

                    Bundle bundle = new Bundle();
                    Intent intent = new Intent(getActivity(),Maps_activity.class);
                    intent.putExtra("posicion", (Parcelable) puntosInteres);
                    startActivity(intent);
                    /*
                    Intent intent = new Intent(String.valueOf(puntosInteres));
                    intent.putParcelableArrayListExtra("posicion", puntosInteres);
                    MapFragment mapa = new MapFragment();
                    startActivity(new Intent(getActivity(), Maps_activity.class));
*/
                }


            });

        }
        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


}
