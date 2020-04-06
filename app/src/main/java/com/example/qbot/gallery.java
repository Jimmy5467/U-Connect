package com.example.qbot;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;


/**
 * A simple {@link Fragment} subclass.
 */
public class gallery extends Fragment {

        private FirebaseFirestore fb= FirebaseFirestore.getInstance();
        private CollectionReference gal=fb.collection("Gallery");
        private gall_adpt adapter;


    public gallery() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_gallery, container, false);

        Query q= gal.orderBy("url", Query.Direction.ASCENDING);
        FirestoreRecyclerOptions<gall_detail> options = new FirestoreRecyclerOptions.Builder<gall_detail>()
                .setQuery(gal,gall_detail.class)
                .build();
        adapter = new gall_adpt(options);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_image);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        recyclerView.setAdapter(adapter);

        return  view;
    }

    @Override
    public void onStart()
    {
        super.onStart();
        adapter.startListening();
    }

    @Override
    public void onStop()
    {
        super.onStop();
        adapter.startListening();
    }

}
