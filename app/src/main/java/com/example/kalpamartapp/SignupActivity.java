package com.example.kalpamartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {
    EditText username, phoneno,email, password;
    Button SignUp;
    TextView popup;
    ImageView close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        username = findViewById(R.id.username);
        phoneno = findViewById(R.id.phn);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        SignUp = findViewById(R.id.signup);
        popup = findViewById(R.id.popup);
        close = findViewById(R.id.close);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, VerificationActivity.class);
                startActivity(intent);
            }
        });

        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLayout();
            }
        });

    }

    public void showLayout() {

        final Dialog dialog = new Dialog(this, R.style.Theme_AppCompat_Light_Dialog_Alert);
        dialog.setTitle("Add");

        View view = LayoutInflater.from(this).inflate(R.layout.popup, null);


        Button apply = view.findViewById(R.id.apply);

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();

            }
        });

        dialog.setContentView(view);
        dialog.show();

    }

}
