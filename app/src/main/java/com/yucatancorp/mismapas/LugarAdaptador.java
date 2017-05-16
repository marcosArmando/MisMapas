package com.yucatancorp.mismapas;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by marcos on 05/05/2017.
 */

public class LugarAdaptador extends RecyclerView.Adapter<LugarAdaptador.LugarViewHolder>{

    ArrayList<Lugar> lugares;
    Activity activity;

    public LugarAdaptador(ArrayList<Lugar> lugares, Activity activity) {
        this.lugares = lugares;
        this.activity = activity;
    }

    @Override
    public LugarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.boton, parent, false);
        return new LugarViewHolder(v);
    }

    @Override
    public void onBindViewHolder(LugarViewHolder holder, int position) {
        final Lugar lugar = lugares.get(position);
        holder.logo.setImageResource(lugar.getLogo());
        holder.imagen.setImageResource(lugar.getFoto());

        holder.imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, MapsActivity.class);
                intent.putExtra("longitud", lugar.getLongitud());
                intent.putExtra("latitud",  lugar.getLatitud());
                intent.putExtra("nombre", lugar.getNombre());
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lugares.size();
    }

    public static class LugarViewHolder extends RecyclerView.ViewHolder{

        private ImageView logo;
        private ImageView imagen;

        public LugarViewHolder(View itemView) {
            super(itemView);
            logo   = (ImageView) itemView.findViewById(R.id.logo);
            imagen = (ImageView) itemView.findViewById(R.id.imagen);
        }
    }
}
