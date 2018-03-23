package com.local.conoce_hervs.rv_rutas;


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
import com.local.conoce_hervs.model.ModelRutas;
import com.local.conoce_hervs.fragments.interfazClickListener.RecyclerViewClickListener;
import com.local.conoce_hervs.picasso.PicassoCache;


import java.util.List;

public class AdaptadorRutas extends RecyclerView.Adapter<AdaptadorRutas.RutasViewHolder> {

    List<ModelRutas> rutas;
    private static RecyclerViewClickListener mListener;
    private Context mainContext;


    /**
     * Constructor
     */
    public AdaptadorRutas(List<ModelRutas> rutas, Context context,  RecyclerViewClickListener itemClick) {

        this.rutas = rutas;
        this.mainContext = context;
        mListener = itemClick;
    }



    @Override
    public RutasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_rutas, parent, false);
        RutasViewHolder rvh = new RutasViewHolder(v);

        return rvh;

    }

    @Override
    public void onBindViewHolder(RutasViewHolder holder, int position) {
        holder.rutaNombre.setText(rutas.get(position).getNombre());

        PicassoCache.getPicassoInstance(this.mainContext).load(rutas.get(position).getFoto())
                .resize(200, 200)
                .into(holder.rutasFoto);
    }

    @Override
    public int getItemCount() {
        return rutas.size();
    }


    /**
     * SubClase para el ViewHolder
     */
    public class RutasViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        CardView cv;
        TextView rutaNombre;
        ImageView rutasFoto;

        RutasViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.cvRuta);
            rutaNombre = itemView.findViewById(R.id.rutaName);
            rutasFoto = itemView.findViewById(R.id.rutasfoto);

            cv.setOnClickListener(this);

        }


        @Override
        public void onClick(View view) {

            mListener.recyclerViewListClicked(view, getLayoutPosition());


        }
    }





}