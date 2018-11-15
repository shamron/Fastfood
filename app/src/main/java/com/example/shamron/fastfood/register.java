package com.example.shamron.fastfood;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button showDialog = findViewById(R.id.btn_signUp);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(register.this);
                View mview = getLayoutInflater().inflate(R.layout.dialog_registration, null);

                builder.setView(mview);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }


}


