package com.local.conoce_hervs.rv_hoteles;

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
import com.local.conoce_hervs.model.ModelAlojamiento;
import com.local.conoce_hervs.fragments.interfazClickListener.RecyclerViewClickListener;
import com.local.conoce_hervs.picasso.PicassoCache;

import java.util.List;

public class AdaptadorHotel extends RecyclerView.Adapter<AdaptadorHotel.HotelesViewHolder> {

    private Context mainContext;
    List<ModelAlojamiento> hotels;

    private static RecyclerViewClickListener mListener;



    /**
     * Constructor
     *
     * @param hotels
     */
    public AdaptadorHotel(List<ModelAlojamiento> hotels, Context context, RecyclerViewClickListener itemClick) {
        this.hotels = hotels;
        this.mainContext = context;
        mListener = itemClick;
    }

    @Override
    public HotelesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_hoteles, parent, false);
        HotelesViewHolder hvh = new HotelesViewHolder(v);

        return hvh;
    }

    @Override
    public void onBindViewHolder(HotelesViewHolder holder, int position) {
        holder.hotelNombre.setText(hotels.get(position).getNombre());

        PicassoCache.getPicassoInstance(this.mainContext).load(hotels.get(position).getImagen())
                .resize(200, 200)
                .into(holder.hotelPhoto);


    }

    @Override
    public int getItemCount() {

        return hotels.size();
    }




    /**
     * SubClase para el ViewHolder
     */
    public class HotelesViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {
        CardView cv;
        TextView hotelNombre;
        ImageView hotelPhoto;

        HotelesViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.cv);
            hotelNombre = itemView.findViewById(R.id.hotelName);
            hotelPhoto = itemView.findViewById(R.id.hotelPhoto);

            cv.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            mListener.recyclerViewListClicked(view, getLayoutPosition());

        }
    }

}
