package com.example.manager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class HomeRecylerView extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_recyler_view);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        HomeAdapter homeAdapter= new HomeAdapter();
        recyclerView.setAdapter(homeAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        int i;
        for (
                i=0; i<30; i++){
            homeAdapter.notifyDataSetChanged();
        }

    }
}
