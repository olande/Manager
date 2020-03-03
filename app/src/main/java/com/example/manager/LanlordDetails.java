package com.example.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LanlordDetails<chooser> extends AppCompatActivity {
Button button1, button2;
Intent intent=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanlord_details);

        button1=(Button)findViewById(R.id.launchmap);
        button2=(Button)findViewById(R.id.coordinates);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:19.076.72.8777"));
                Intent chooser = intent.createChooser(intent, "Launch Maps");
                startActivity(chooser);
            }
        });
    }
}
