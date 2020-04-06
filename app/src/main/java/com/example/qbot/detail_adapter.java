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

public class detail_adapter extends FirestoreRecyclerAdapter<fact_detail,detail_adapter.detailHolder> {


    public detail_adapter(@NonNull FirestoreRecyclerOptions<fact_detail> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull detailHolder hold, int position, @NonNull fact_detail model) {
      hold.name.setText(model.getName());
      hold.email.setText(model.getEmail());
      hold.position.setText(String.valueOf(model.getPosition()));
        Picasso.get().load(model.getUrl()).into(hold.ima);
    }

    @NonNull
    @Override
    public detailHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.facult_detail,parent, false);
        return new detailHolder(v);
    }

    class detailHolder extends RecyclerView.ViewHolder
    {
        TextView name;
        TextView email;
        TextView position;
        ImageView ima;

        public detailHolder(@NonNull View itemView) {
            super(itemView);
            name  = itemView.findViewById(R.id.name_det);
            email = itemView.findViewById(R.id.email_det);
            position = itemView.findViewById(R.id.position_det);
            ima   = itemView.findViewById(R.id.image);

        }
    }
}
