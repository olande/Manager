package com.example.manager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
public class HomeAdapter extends RecyclerView.Adapter<HomeHolder> {
    Context context;
    @NonNull
    @Override
    public HomeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.customhome,parent,false);
        return new HomeHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull HomeHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
