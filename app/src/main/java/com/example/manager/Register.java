package com.example.manager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class Register extends AppCompatActivity {
    TextView name,password, workingNo,phonenumber;
    ImageView imageView;
    Button button1,button2;
    private final  int  PICK_IMAGE=0;
    Uri imageUri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name=(TextView)findViewById(R.id.name);
        password=(TextView)findViewById(R.id.password);
        workingNo=(TextView)findViewById(R.id.worknumber);
        phonenumber=(TextView)findViewById(R.id.pnumber);
        imageView=(ImageView)findViewById(R.id.photo);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gallary= new Intent();
                gallary.setType("image/*");
                gallary.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(gallary,"select image"),PICK_IMAGE);
            }
        });


        button1=(Button)findViewById(R.id.register);
        button2=(Button)findViewById(R.id.login);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Register.this, workers.class);
                    startActivity(intent);
                }
            });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Register.this, workers.class);
                startActivity(intent);
            }
        });



    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode==PICK_IMAGE && resultCode==RESULT_OK  && data!=null ){
            imageUri = data.getData();

            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), imageUri);
                imageView.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
