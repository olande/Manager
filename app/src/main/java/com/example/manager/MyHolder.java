package com.example.manager;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView textView;
    public MyHolder(@NonNull final View itemView) {
        super(itemView);
   textView=itemView.findViewById(R.id.complain);

    textView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Toast.makeText(itemView.getContext(), "hello world", Toast.LENGTH_SHORT).show();


            Intent intent=new Intent(itemView.getContext(),Complain1.class);
            itemView.getContext().startActivity(intent);

        }
    });

    }

    @Override
    public void onClick(View v) {


    }
}
