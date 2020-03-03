package com.example.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Homepage extends AppCompatActivity {

    ImageView imageView1,imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
  imageView1=(ImageView)findViewById(R.id.manager);
  imageView2=(ImageView)findViewById(R.id.workers);
  imageView1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent intent=new Intent(Homepage.this,SignIn.class);
          startActivity(intent);
      }
  });
imageView2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent intent= new Intent(Homepage.this,workerlogin.class);
        startActivity(intent);
    }
});



    }
}
