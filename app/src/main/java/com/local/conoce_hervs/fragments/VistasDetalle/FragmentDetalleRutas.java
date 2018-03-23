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
import com.local.conoce_hervs.model.ModelRutas;
import com.local.conoce_hervs.picasso.PicassoCache;

public class FragmentDetalleRutas extends android.app.Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detalle_rutas, container, false);
        Bundle bundle = getArguments();
        ModelRutas rutas;
        ConstraintLayout constraintLayout = new ConstraintLayout(getActivity());


        if (bundle != null) {
            rutas = bundle.getParcelable("posicion");
            String nombre, tipo, distancia, duracion, dificultad, itinerario, imagen, descarga;
            nombre = rutas.getNombre().toString();
            tipo = rutas.getTipo().toString();
            distancia = rutas.getDistancia().toString();
            duracion = rutas.getDuracion().toString();
            dificultad = rutas.getDificultad().toString();
            itinerario = rutas.getItinerario().toString();
            imagen = rutas.getFoto().toString();
            descarga= rutas.getLink().toString();
            TextView tvnombre = v.findViewById(R.id.tvNombre);
            TextView tvtipo = v.findViewById(R.id.tvTipo);
            TextView tvdistancia = v.findViewById(R.id.tvDistancia);
            TextView tvduracion = v.findViewById(R.id.tvDuracion);
            TextView tvdificultad = v.findViewById(R.id.tvDificultad);
            TextView tvitinerario = v.findViewById(R.id.tvItinerario);
            TextView tvDescarga = v.findViewById(R.id.tvDescarga);
            ImageView foto = v.findViewById(R.id.imagen);
            tvnombre.setText(nombre);
            tvtipo.setText(tipo);
            tvdistancia.setText(distancia);
            tvduracion.setText(duracion);
            tvdificultad.setText(dificultad);
            tvitinerario.setText(itinerario);
            tvDescarga.setText(descarga);
            PicassoCache.getPicassoInstance(this.getActivity()).load(imagen)
                    .resize(450, 300)
                    .into(foto);
        }

        return v;
    }

    @Override
    public void onViewCreated (View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
    }


}
