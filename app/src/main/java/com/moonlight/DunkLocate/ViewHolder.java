package com.moonlight.DunkLocate;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Locale;

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView gorselView;
    TextView ilceView, nameView;
    Context context;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        gorselView = itemView.findViewById(R.id.konumunGorseli);
        ilceView = itemView.findViewById(R.id.ilce);
        nameView = itemView.findViewById(R.id.name);
        context = itemView.getContext();
    }

    public void bind(final SahaVerileri veri) {
        nameView.setText(veri.getSahaAdi());
        ilceView.setText(veri.getSahaIlcesi());
        gorselView.setImageResource(veri.getGorsel());

        itemView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String uri = String.format(Locale.US, "http://maps.google.com/maps?daddr=%f,%f", veri.getSahaEnlem(), veri.getSahaBoylam());
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);
            }
        });
    }
}
