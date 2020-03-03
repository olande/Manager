package com.example.manager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ManagerRegister<requestCode> extends AppCompatActivity {
    TextView Name,Worknumber,Phonenumber,Addimage;
    ImageView imageView;
    Button button;
    Uri imageUri;
    private static final int PICK_IMAGE = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_register);
        Name= findViewById(R.id.name);
        Worknumber=findViewById(R.id.worknumber);
        Phonenumber= findViewById(R.id.pnumber);
        Addimage= findViewById(R.id.addimage);
        imageView= findViewById(R.id.image);
        button= findViewById(R.id.button);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Intent gallary= new Intent();
       gallary.setType("image/*");
       gallary.setAction(Intent.ACTION_GET_CONTENT);
       startActivityForResult(Intent.createChooser(gallary,"select image"),PICK_IMAGE);
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
