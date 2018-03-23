package com.local.conoce_hervs.fragments.VistasDetalle;


import android.app.Fragment;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.local.conoce_hervs.R;
import com.local.conoce_hervs.model.ModelAlojamiento;
import com.local.conoce_hervs.picasso.PicassoCache;


public class FragmentDetalleHoteles extends Fragment {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detalle_hoteles, container, false);
        Bundle bundle = getArguments();
        ModelAlojamiento alojamiento;
        ConstraintLayout constraintLayout = new ConstraintLayout(getActivity());

        if (bundle != null) {
            alojamiento = bundle.getParcelable("posicion");
            String nombre, localizacion, descripcion, contacto, link, imagen;
            nombre=alojamiento.getNombre().toString();
            localizacion=alojamiento.getLocalizacion().toString();
            descripcion=alojamiento.getInformacion().toString();
            contacto=alojamiento.getContacto().toString();
            link=alojamiento.getLink().toString();
            imagen=alojamiento.getImagen().toString();
            TextView tvnombre = v.findViewById(R.id.tvNombre);
            TextView tvlocalizacion = v.findViewById(R.id.tvLocal);
            TextView tvndescripcion = v.findViewById(R.id.tvInfo);
            TextView tvlink = v.findViewById(R.id.tvLink);
            TextView tvcontacto = v.findViewById(R.id.tvContacto);
            ImageView foto=v.findViewById(R.id.imagen);
            tvnombre.setText(nombre);
            tvlocalizacion.setText(localizacion);
            tvndescripcion.setText(descripcion);
            tvlink.setText(link);
            tvcontacto.setText(contacto);
            PicassoCache.getPicassoInstance(this.getActivity()).load(imagen)
                    .resize(450, 300)
                    .into(foto);
        }

        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }




}
