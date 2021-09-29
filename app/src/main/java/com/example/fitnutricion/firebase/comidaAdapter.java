package com.example.fitnutricion.firebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fitnutricion.R;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;

public class comidaAdapter extends RecyclerView.Adapter<comidaAdapter.foodsHolder> {

    Context context;

    ArrayList<Comida> list;

    public comidaAdapter(Context context, ArrayList<Comida> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @NotNull
    @Override
    public comidaAdapter.foodsHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_list_comidas,parent,false);
        return new comidaAdapter.foodsHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull comidaAdapter.foodsHolder holder, int position) {

        Comida foods = list.get(position);
        holder.f_tipo.setText(foods.getF_tipo());
        holder.f_nombrecomida.setText(foods.getF_nombrecomida());
        holder.f_ingredientes.setText(foods.getF_ingredientes());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class foodsHolder extends RecyclerView.ViewHolder{

        TextView f_tipo, f_nombrecomida, f_ingredientes;

        public foodsHolder(View itemView){
            super(itemView);

            f_tipo = itemView.findViewById(R.id.item_tipo);
            f_nombrecomida = itemView.findViewById(R.id.item_nombrecomida);
            f_ingredientes = itemView.findViewById(R.id.item_ingredientes);
        }
    }
}