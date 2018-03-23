package com.local.conoce_hervs.rv_puntosinteres;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.local.conoce_hervs.R;
import com.local.conoce_hervs.model.ModelPuntos;
import com.local.conoce_hervs.fragments.interfazClickListener.RecyclerViewClickListener;
import com.local.conoce_hervs.picasso.PicassoCache;


import java.util.List;

public class AdaptadorInteres extends RecyclerView.Adapter<AdaptadorInteres.InteresViewHolder> {


    List<ModelPuntos> puntos;
    private Context mainContext;
    private static RecyclerViewClickListener mListener;

    /**
     * Constructor
     */
    public AdaptadorInteres(List<ModelPuntos> puntos, Context context,  RecyclerViewClickListener itemClick) {

        this.puntos = puntos;
        this.mainContext = context;
        mListener = itemClick;
    }

    @Override
    public InteresViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_interes, parent, false);
        InteresViewHolder intvh = new InteresViewHolder(v);

        return intvh;

    }

    @Override
    public void onBindViewHolder(InteresViewHolder holder, int position) {

        holder.puntoNombre.setText(puntos.get(position).getNombre());

        PicassoCache.getPicassoInstance(this.mainContext).load(puntos.get(position).getFoto())
                .resize(200, 200)
                .into(holder.puntoPhoto);

    }

    @Override
    public int getItemCount() {
        return puntos.size();
    }


    /**
     * SubClase para el ViewHolder
     */
    public class InteresViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        CardView cv;
        TextView puntoNombre;
        ImageView puntoPhoto;

        InteresViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.cvinteres);
            puntoNombre = itemView.findViewById(R.id.interesnombre);
            puntoPhoto = itemView.findViewById(R.id.interesfoto);

            cv.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            mListener.recyclerViewListClicked(view, getLayoutPosition());

        }
    }
}


