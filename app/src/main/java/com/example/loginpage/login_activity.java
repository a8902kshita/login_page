package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class login_activity extends AppCompatActivity {
    EditText emailId,password;
    Button btnSignUp;
    TextView tvSignIn;
    FirebaseAuth mFirebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mFirebaseAuth = FirebaseAuth.getInstance();
        emailId = findViewById(R.id.editText);
        password = findViewById(R.id.editText2);
        btnSignUp = findViewById(R.id.button);
        btnSignUp.setOnClickListener (new View.OnClickListener () {
                @Override
                        public void onClick(View v) {
                    String email = emailId.getText().toString();
                    String pwd = password.getText().toString();
                    if(email.isEmpty()) {
                        emailId.setError("Please enter email id");
                        emailId.requestFocus();

                    }
else if(pwd.isEmpty()){
    password.setError("Please enter your password");
    password.requestFocus();
                    }
else if(email.isEmpty() && pwd.isEmpty()){
                        Context context;
                        Toast.makeText(context:Object text;
                        MainActivity.this, text:"Fields Are Empty!",Toast.LENGTH_SHORT).show();
                    }
else if(!(email.isEmpty() && pwd.isEmpty())){
    mFirebaseAuth.createUserWithEmailAndPassword(email, pwd)


                    }

                    }
                }
            )
        }