package com.moonlight.DunkLocate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball);
        ImageView locationPic = findViewById(R.id.loc_pic2);
        ImageView profilePic = findViewById(R.id.profile_pic1);
        profilePic.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view2) {
                startActivity(new Intent(BallActivity.this, ProfileActivity.class));
            }
        });

        locationPic.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view2) {
                startActivity(new Intent(BallActivity.this, MainActivity.class));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}