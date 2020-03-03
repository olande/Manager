package com.example.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class workerlogin extends AppCompatActivity {
TextView username,password;
Button login, register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workerlogin);

        username=(TextView)findViewById(R.id.name);
        password=(TextView)findViewById(R.id.password);
      register=(Button)findViewById(R.id.Register);
        login=(Button)findViewById(R.id.login);
               login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(workerlogin.this,workers.class);
                startActivity(intent);
            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(workerlogin.this,Register.class);
                startActivity(intent);
            }
        });

    }
}
