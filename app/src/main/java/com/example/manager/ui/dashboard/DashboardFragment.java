package com.example.manager.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.manager.CheckDailyActivity;
import com.example.manager.DashboardRecyclerView;
import com.example.manager.LanlordDetails;
import com.example.manager.R;

public class DashboardFragment extends Fragment {

  ImageButton person1,bt2,bt3,bt4,bt5,bt6;
  TextView textView;
  ImageView imageView;
    private DashboardViewModel dashboardViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel = ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        ImageButton bt1= (ImageButton)root.findViewById(R.id.image1);
        ImageButton  bt2= (ImageButton)root.findViewById(R.id.image2);
        ImageButton bt3= (ImageButton)root.findViewById(R.id.image3);
         textView=(TextView)root.findViewById(R.id.vehicle);
         imageView=(ImageView)root.findViewById(R.id.location);


    bt1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent= new Intent(getContext(), DashboardRecyclerView.class);
       startActivity(intent);
        }
    });


    bt2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent= new Intent(getContext(), CheckDailyActivity.class);
            startActivity(intent);

        }
    });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getContext(), DashboardRecyclerView.class);
                startActivity(intent);

            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getContext(), DashboardRecyclerView.class);
                startActivity(intent);

            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(getContext(), LanlordDetails.class);
                startActivity(intent);


            }
        });

        return root;

    }
}