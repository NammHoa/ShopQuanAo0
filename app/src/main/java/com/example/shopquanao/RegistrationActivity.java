package com.example.shopquanao;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shopquanao.Activity.MainActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {
EditText edtName,edtEmail,edtPassword;
private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        edtName=findViewById(R.id.edtName);
        edtEmail=findViewById(R.id.edtEmail);
        edtPassword=findViewById(R.id.edtPassword);
        auth =FirebaseAuth.getInstance();

    }



    public void signup(View view) {
    String username=edtName.getText().toString();
    String userEmail=edtEmail.getText().toString();
    String userPassword=edtPassword.getText().toString();
    if(TextUtils.isEmpty(username)){
        Toast.makeText(this,"Enter Name!",Toast.LENGTH_SHORT).show();
        return;
    }
        if(TextUtils.isEmpty(userEmail)){
            Toast.makeText(this,"Enter Email Address!",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(userPassword)){
            Toast.makeText(this,"Enter Password!",Toast.LENGTH_SHORT).show();
            return;
        }
        if(userPassword.length()<6){
            Toast.makeText(this,"Password too short, enter minimum 6 characters !",Toast.LENGTH_SHORT)
                    .show();
            return;
        }
       // startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
        auth.createUserWithEmailAndPassword(userEmail,userPassword).addOnCompleteListener(RegistrationActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(RegistrationActivity.this,"Successfully Register",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
                }
                else {
                    Toast.makeText(RegistrationActivity.this,"Registration Failed"+task.getException(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void signin(View view) {
        startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
    }
}