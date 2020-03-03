package com.example.manager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class cardview extends AppCompatActivity {
    TextView Name,Complain, Time;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview);
        Complain=(TextView)findViewById(R.id.complain);
        Name=(TextView)findViewById(R.id.name);
        Time=(TextView)findViewById(R.id.time);
        imageView=(ImageView)findViewById(R.id.image);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(cardview.this,Complain1.class);
                startActivity(intent);
            }
        });



    }

}
