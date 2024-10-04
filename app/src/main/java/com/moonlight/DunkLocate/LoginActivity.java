package com.moonlight.DunkLocate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    private EditText usernameEdit, passwdEdit;
    private Button loginBtn;
    private PreferenceHelper preferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        preferenceHelper = new PreferenceHelper(this);

        if (preferenceHelper.isLoggedIn()) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }
        initView();
    }

    private void initView() {
        usernameEdit = findViewById(R.id.editTextUsername);
        passwdEdit = findViewById(R.id.editTextPassword);
        loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (usernameEdit.getText().toString().isEmpty() || passwdEdit.getText().toString().isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Lütfen alanları doldurunuz.", Toast.LENGTH_SHORT).show();
                } else if (usernameEdit.getText().toString().equals("dunklocate") && passwdEdit.getText().toString().equals("dunk123")) {
                    preferenceHelper.setLogin(true);
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "Hatalı giriş. Tekrar deneyiniz.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
