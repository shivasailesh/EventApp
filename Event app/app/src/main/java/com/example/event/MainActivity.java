package com.example.event;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private Button adminBtn, userBtn, adminLoginBtn, userLoginBtn;

    private TextInputLayout adminUserName, adminPassword, userUserName, userPassword;

    private RelativeLayout adminRelLayout, userRelLayout;

    private TextView registerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        adminBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adminRelLayout.setVisibility(View.VISIBLE);
                userRelLayout.setVisibility(View.GONE);
            }
        });
        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adminRelLayout.setVisibility(View.GONE);
                userRelLayout.setVisibility(View.VISIBLE);
            }
        });
        adminLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifyAdminDetails();
            }
        });
    }

    private void verifyAdminDetails()
    {
        if(adminUserName.getEditText().getText().toString().equals("admin"))
        {
            adminUserName.setErrorEnabled(true);
            adminUserName.setError(null);
            if(adminPassword.getEditText().getText().toString().equals("admin"))
            {
                adminPassword.setErrorEnabled(true);
                adminPassword.setError(null);
                Intent intent =new Intent(MainActivity.this,AddEventPage.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
            else
            {
                adminPassword.setErrorEnabled(true);
                adminPassword.setError("Incorrect Password");
            }
        }
        else
        {
            adminUserName.setErrorEnabled(true);
            adminUserName.setError("Invalid Username");
        }
    }

    private void initializeViews() {
        adminBtn = findViewById(R.id.homePage_adminBtn);
        userBtn = findViewById(R.id.homePage_userBtn);
        adminLoginBtn = findViewById(R.id.homePage_adminLoginBtn);
        userLoginBtn = findViewById(R.id.homePage_userLoginBtn);
        adminUserName = findViewById(R.id.homePage_adminUserName);
        adminPassword = findViewById(R.id.homePage_adminPassword);
        userUserName = findViewById(R.id.homePage_userUserName);
        userPassword = findViewById(R.id.homePage_userPassword);
        adminRelLayout = findViewById(R.id.homePage_adminRelLayout);
        userRelLayout = findViewById(R.id.homePage_userRelLayout);
        registerText = findViewById(R.id.homePage_newUserText);
    }
}