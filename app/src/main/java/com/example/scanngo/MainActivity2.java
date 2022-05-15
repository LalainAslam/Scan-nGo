package com.example.scanngo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {
private TextView textView2;
private Button login;
private EditText email;
private EditText password;
private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2= (TextView) findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v2)
            {
                openRegister();
            }
        });

        firebaseAuth= FirebaseAuth.getInstance();

    email=findViewById(R.id.email);
    password=findViewById(R.id.password);
    login=findViewById(R.id.login);

    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String getEmail = email.getText().toString();
            String getPassword = password.getText().toString();
            firebaseAuth.signInWithEmailAndPassword(getEmail, getPassword)
                    .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                        @Override
                        public void onSuccess(AuthResult authResult) {
                            Toast.makeText(MainActivity2.this, "Welcome User", Toast.LENGTH_SHORT).show();

                            login = (Button) findViewById(R.id.login);
                            login.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    openActivity2();
                                }
                            });
                        }

                        public void openActivity2() {
                            Intent intent = new Intent(MainActivity2.this, MenuPage.class);
                            startActivity(intent);
                        }

                        }
                    )

                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(MainActivity2.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
        }
    });

    }

    public void openRegister()
    {
        Intent intent2 = new Intent(this, Register.class);
        startActivity(intent2);
    }
}