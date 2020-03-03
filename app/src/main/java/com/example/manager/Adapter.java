package com.example.manager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.manager.ui.Model;
import java.util.ArrayList;

public class  Adapter extends RecyclerView.Adapter<MyHolder> {
    Context context;
    ArrayList<Model>models;
    public Adapter() {
        this.context = context;
        this.models = models;

    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new MyHolder(view);


    }
    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {



    }
    @Override
    public int getItemCount() {
        return 20;
    }
}
