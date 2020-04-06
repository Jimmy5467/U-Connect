package com.example.qbot;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class new_faculty extends Fragment {


    public new_faculty() {
        // Required empty public constructor
    }

    Button dps,csp,i2m,cmp,cip,pdp,rpc,mti,ari;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_faculty, container, false);
        dps = view.findViewById(R.id.deps);
        csp = view.findViewById(R.id.csp);
        i2m = view.findViewById(R.id.i2i);
        cmp = view.findViewById(R.id.cmp);
        cip = view.findViewById(R.id.cip);
        rpc = view.findViewById(R.id.rpc);
        pdp = view.findViewById(R.id.pdp);
        mti = view.findViewById(R.id.mti);
        ari = view.findViewById(R.id.ari);



        dps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                ft.replace(R.id.new_fac,new dep_faculty());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        csp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                ft.replace(R.id.new_fac,new csp_faculty());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        i2m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                ft.replace(R.id.new_fac,new i2im_faculty());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        cmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                ft.replace(R.id.new_fac,new cmpi_faculty());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        cip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                ft.replace(R.id.new_fac,new cips_faculty());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        rpc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                ft.replace(R.id.new_fac,new rpcp_faculty());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        mti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                ft.replace(R.id.new_fac,new mtin_faculty());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        ari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft =getFragmentManager().beginTransaction();
                ft.replace(R.id.new_fac,new arip_faculty());
                ft.addToBackStack(null);
                ft.commit();
            }
        });


        return  view;
    }

}
