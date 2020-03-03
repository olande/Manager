package com.example.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class workers extends AppCompatActivity {
ImageButton imageButton1, imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workers);

        imageButton1=(ImageButton)findViewById(R.id.image1);
        imageButton2=(ImageButton)findViewById(R.id.image2);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           Intent intent= new Intent(workers.this,LanlordDetails.class);
                startActivity(intent);
            }
        });

    }
}
