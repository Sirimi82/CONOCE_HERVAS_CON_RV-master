package com.local.conoce_hervs.rv_bares;


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
import com.local.conoce_hervs.model.ModelBares;
import com.local.conoce_hervs.fragments.interfazClickListener.RecyclerViewClickListener;
import com.local.conoce_hervs.picasso.PicassoCache;

import java.util.List;

public class AdaptadorBares extends RecyclerView.Adapter<AdaptadorBares.BaresViewHolder>{

    List<ModelBares> bars;
    private Context mainContext;

    private static RecyclerViewClickListener mListener;

    /**
     * Constructor
     */
    public AdaptadorBares(List<ModelBares> bars, Context context, RecyclerViewClickListener itemClick) {

        this.bars = bars;
        this.mainContext = context;
        mListener = itemClick;

    }


    @Override
    public BaresViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_bares, parent, false);
        BaresViewHolder bvh = new BaresViewHolder(v);

        return bvh;
    }

    @Override
    public void onBindViewHolder(BaresViewHolder holder, int position) {

        holder.barNombre.setText(bars.get(position).getNombre());

        PicassoCache.getPicassoInstance(this.mainContext).load(bars.get(position).getFoto())
                .resize(200, 200)
                .into(holder.barFoto);

    }

    @Override
    public int getItemCount() {
        return bars.size();
    }



    /**
     * SubClase para el ViewHolder
     */
    public class BaresViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {
        CardView cv;
        TextView barNombre;
        ImageView barFoto;

        BaresViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.cvBar);
            barNombre = itemView.findViewById(R.id.barName);
            barFoto = itemView.findViewById(R.id.barPhoto);

            cv.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {

            mListener.recyclerViewListClicked(view, getLayoutPosition());

        }
    }




}