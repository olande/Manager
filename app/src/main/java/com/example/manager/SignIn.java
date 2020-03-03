package com.example.manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.manager.ui.dashboard.DashboardFragment;


public class SignIn extends AppCompatActivity {
EditText Username,Password;
Button signin,register;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
     Username= (EditText) findViewById(R.id.workemail);
     Password=(EditText)findViewById(R.id.password);
     textView=(TextView)findViewById(R.id.textview);
     register=(Button)findViewById(R.id.Register);
     signin=(Button)findViewById(R.id.button);

     signin.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             Intent intent= new Intent(SignIn.this,MainActivity.class );
             startActivity(intent);

         }
     });
     register.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {


             Intent intent =new Intent(SignIn.this,ManagerRegister.class);
             startActivity(intent);
         }
     });
    }
}
