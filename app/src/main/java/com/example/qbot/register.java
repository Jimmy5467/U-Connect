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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {

    EditText email;
    EditText Password;

    Button rgs;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle("Loading");
        pd.setMessage("Please Wait,uploading data");



        email = findViewById(R.id.email_ID);
        Password = findViewById(R.id.pass);
        rgs = findViewById(R.id.sub);


        mAuth = FirebaseAuth.getInstance();


        rgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pd.show();
                String e_mail= email.getText().toString();
                String pasw = Password.getText().toString();

                mAuth.createUserWithEmailAndPassword(e_mail,pasw).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        pd.show();
                        if(task.isSuccessful())
                        {
                            Toast.makeText(register.this, "User Registered successfully", Toast.LENGTH_SHORT).show();
                            pd.hide();
                            startActivity(new Intent(register.this,bottom_nav.class));
                        }
                        else
                        {
                            pd.hide();
                            Toast.makeText(register.this, "Registration Failed,Pls register again!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}
