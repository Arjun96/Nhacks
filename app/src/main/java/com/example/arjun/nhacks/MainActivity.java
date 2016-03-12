package com.example.arjun.nhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signUp(View view){

        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);

    }

    public void login(View view){
        Intent intent = new Intent(this, GroupsActivity.class);
        startActivity(intent);
    }



}
