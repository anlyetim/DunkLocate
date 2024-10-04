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

public class AnadoluYakasiAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context contextAnadolu;
    private List<SahaVerileri> verilerAdolu;

    public AnadoluYakasiAdapter(Context context, List<SahaVerileri> AdoluVerileri) {
        this.contextAnadolu = context;
        this.verilerAdolu = AdoluVerileri;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view1 = LayoutInflater.from(contextAnadolu).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SahaVerileri veri1 = verilerAdolu.get(position);
        holder.bind(veri1);
    }

    @Override
    public int getItemCount() {
        return verilerAdolu.size();
    }
}