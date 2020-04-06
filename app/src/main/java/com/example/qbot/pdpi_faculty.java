package com.example.qbot;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class pdpi_faculty extends Fragment {

    private FirebaseFirestore db =FirebaseFirestore.getInstance();
    private CollectionReference det = db.collection("Faculty").document("DEPSTAR").collection("members");
    private detail_adapter adapter;

    public pdpi_faculty()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_pdpi_faculty, container, false);

        Query q= det.orderBy("priority", Query.Direction.ASCENDING);
        FirestoreRecyclerOptions<fact_detail> options = new FirestoreRecyclerOptions.Builder<fact_detail>()
                .setQuery(q,fact_detail.class)
                .build();
        adapter = new detail_adapter(options);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;

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