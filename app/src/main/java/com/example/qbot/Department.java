package com.example.qbot;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;


public class Department extends Fragment
{
    ImageButton dstar , csp , pdp , i2i;
    private TextView tv1,tv2;
    private FirebaseFirestore fb;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_department,container,false);
         dstar=view.findViewById(R.id.Deps);
         csp =view.findViewById(R.id.cspi);
         pdp =view.findViewById(R.id.pdpi);
         i2i =view.findViewById(R.id.i2im);
         fb = FirebaseFirestore.getInstance();
        tv1 = view.findViewById(R.id.information_name);
        tv2 = view.findViewById(R.id.information);//providing id of view to its object

        dstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetch3();
            }
        });
        csp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetch1();
            }
        });
        pdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetch2();
            }
        });
        i2i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetch4();
            }
        });

        fb.collection("Departments").document("CSPIT")
                .get()
                .addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot doc = task.getResult();
                            StringBuilder field1 = new StringBuilder("");
                            StringBuilder field2 = new StringBuilder("");
                            field1.append(doc.get("name"));
                            tv1.setText(field1.toString());
                            field2.append("\n\n").append(doc.get("info")).append("\n\n");
                            tv2.setText(field2.toString());

                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });

        return view;
    }
    public void fetch1()
    {
        fb.collection("Departments").document("CSPIT")
                .get()
                .addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot doc = task.getResult();
                            StringBuilder field1 = new StringBuilder("");
                            StringBuilder field2 = new StringBuilder("");
                            field1.append(doc.get("name"));
                            tv1.setText(field1.toString());
                            field2.append("\n\n").append(doc.get("info")).append("\n\n");
                            tv2.setText(field2.toString());

                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });

    }
    public void fetch2()
    {
        fb.collection("Departments").document("PDPIAS")
                .get()
                .addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot doc = task.getResult();
                            StringBuilder field1 = new StringBuilder("");
                            StringBuilder field2 = new StringBuilder("");
                            field1.append(doc.get("name"));
                            tv1.setText(field1.toString());
                            field2.append("\n\n").append(doc.get("info")).append("\n\n");
                            tv2.setText(field2.toString());
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });

    }

    public void fetch3()
    {
        fb.collection("Departments").document("DEPSTAR")
                .get()
                .addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot doc = task.getResult();
                            StringBuilder field1 = new StringBuilder("");
                            StringBuilder field2 = new StringBuilder("");
                            field1.append(doc.get("name"));
                            tv1.setText(field1.toString());
                            field2.append("\n\n").append(doc.get("info")).append("\n\n");
                            tv2.setText(field2.toString());
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });

    }

    public void fetch4() {
        fb.collection("Departments").document("I2IM")
                .get()
                .addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot doc = task.getResult();
                            StringBuilder field1 = new StringBuilder("");
                            StringBuilder field2 = new StringBuilder("");
                            field1.append(doc.get("name"));
                            tv1.setText(field1.toString());
                            field2.append("\n\n").append(doc.get("info")).append("\n\n");
                            tv2.setText(field2.toString());
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                    }
                });

    }
}
