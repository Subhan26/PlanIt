package com.example.planit;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {

    EditText login_email;
    EditText login_pass;
    Button login_btn;
    Button sign_btn;
    CheckBox rememberMe;
    FirebaseAuth auth;
    FirebaseDatabase firebaseDatabase;
    FirebaseUser user;
    DatabaseReference databaseReference;
    TextInputLayout txtInLayoutUsername, txtInLayoutPassword;
    boolean check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_email = findViewById(R.id.username);
        login_pass = findViewById(R.id.password);
        login_btn = findViewById(R.id.login);
        sign_btn = findViewById(R.id.signUp);
        rememberMe = findViewById(R.id.rememberMe);
        txtInLayoutUsername = findViewById(R.id.txtInLayoutUsername);
        txtInLayoutPassword = findViewById(R.id.txtInLayoutPassword);

        firebaseDatabase = FirebaseDatabase.getInstance();
        auth = FirebaseAuth.getInstance();
        databaseReference = firebaseDatabase.getReference("users");



        if (user != null) {
            startActivity(new Intent(this, main__Screen.class));
        }

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                check=false;
                String email = login_email.getText().toString();
                String pass = login_pass.getText().toString();

                if (login_email.getText().toString().trim().isEmpty())
//                (email.equals(""))
                {
                    Snackbar snackbar = Snackbar.make(v, "Please fill out these fields",
                            Snackbar.LENGTH_LONG);
                    View snackbarView = snackbar.getView();
                    snackbarView.setBackgroundColor(getResources().getColor(R.color.red));
                    snackbar.show();
                    txtInLayoutUsername.setError("Username should not be empty");
//                    check=true;
//                    login_email.setError("Field required");
                }
                if (pass.equals(" "))
                {
//                    Snackbar snackbar = Snackbar.make(v, "Please fill out these fields",
//                            Snackbar.LENGTH_LONG);
//                    View snackbarView = snackbar.getView();
//                    snackbarView.setBackgroundColor(getResources().getColor(R.color.red));
//                    snackbar.show();
//                    txtInLayoutPassword.setError("Password should not be empty");
                    check=true;
                    login_pass.setError("Field required");
                }

                else if(!check)
                authUser(email, pass);
            }
        });

        sign_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Sign_up.class));
                finish();
            }
        });

    }

        private void authUser (String email, String pass) {


            auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        user = auth.getCurrentUser();
                        startActivity(new Intent(Login.this, main__Screen.class));
                        finish();
                    }
                }
            });
        }





    }



