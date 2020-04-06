package com.example.qbot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.squareup.picasso.Picasso;

public class gall_adpt extends FirestoreRecyclerAdapter<gall_detail,gall_adpt.picHolder> {


    public gall_adpt(@NonNull FirestoreRecyclerOptions<gall_detail> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull picHolder hold, int position, @NonNull gall_detail model) {
       // hold.name.setText(model.getName());
        //hold.email.setText(model.getEmail());
        //hold.position.setText(String.valueOf(model.getPosition()));
        Picasso.get().load(model.getUrl()).into(hold.ima2);
    }

    @NonNull
    @Override
    public picHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_pic,parent, false);
        return new picHolder(v);
    }

    class picHolder extends RecyclerView.ViewHolder
    {
        ImageView ima2;

        public picHolder(@NonNull View itemView) {
            super(itemView);
           // name  = itemView.findViewById(R.id.name_det);
            //email = itemView.findViewById(R.id.email_det);
            //position = itemView.findViewById(R.id.position_det);
            ima2  = itemView.findViewById(R.id.pic);

        }
    }
}
