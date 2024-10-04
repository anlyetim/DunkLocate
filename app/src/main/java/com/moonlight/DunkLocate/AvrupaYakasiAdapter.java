package com.moonlight.DunkLocate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moonlight.DunkLocate.SahaVerileri;
import com.moonlight.DunkLocate.ViewHolder;

import java.util.List;

public class AvrupaYakasiAdapter extends RecyclerView.Adapter<ViewHolder> {
    Context contextAvrupa;
    List<SahaVerileri> verilerAvrupa;

    public AvrupaYakasiAdapter(Context context, List<SahaVerileri> VerilerAvrupa) {
        this.contextAvrupa = context;
        this.verilerAvrupa = VerilerAvrupa;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view2 = LayoutInflater.from(contextAvrupa).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view2);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SahaVerileri veri2 = verilerAvrupa.get(position);
        holder.bind(veri2);
    }

    @Override
    public int getItemCount() {
        return verilerAvrupa.size();
    }
}