package com.moonlight.DunkLocate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
    Context context;
    List<SahaVerileri> veriler;
    public MyAdapter(Context context, List<SahaVerileri> veriler) {
        this.context = context;
        this.veriler = veriler;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SahaVerileri veri = veriler.get(position);
        holder.bind(veri);
    }

    @Override
    public int getItemCount() {
        return veriler.size();
    }
}

