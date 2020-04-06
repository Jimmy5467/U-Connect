package com.example.qbot;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class home_fragment extends Fragment
{

    CardView depart,faculty,gallery;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_home_fragment,container,false);


        depart = (CardView) view.findViewById(R.id.departments);
        faculty = (CardView) view.findViewById(R.id.fact);
        gallery = (CardView) view.findViewById(R.id.gallery) ;

        depart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                ft.replace(R.id.home_frag,new Department());
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                ft.replace(R.id.home_frag,new new_faculty());
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                ft.replace(R.id.home_frag,new gallery());
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.home_frag,new Department() )
                fr.commit();
            }
        });*/


        return view;
    }

}