package com.example.qbot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.api.Backend;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    EditText ln_email;
    EditText ln_password;
    Button ln_login;
    Button ln_register;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ln_email = findViewById(R.id.emailAdd);
        ln_password = findViewById(R.id.pas);

        ln_login = findViewById(R.id.log);
        ln_register = findViewById(R.id.create);



        ln_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth mAuth = FirebaseAuth.getInstance();

                String emid = ln_email.getText().toString();
                String pasw = ln_password.getText().toString();

                if(emid.length()==0 || pasw.length()==0)
                {
                    Toast.makeText(login.this, "Enter email or password again", Toast.LENGTH_SHORT).show();
                    return;
                }

                
                mAuth.signInWithEmailAndPassword(emid,pasw).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                           startActivity(new Intent(login.this,bottom_nav.class));
                        }
                        else 
                        {
                            Toast.makeText(login.this,task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });





        ln_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(login.this,register.class));
            }
        });
    }

}