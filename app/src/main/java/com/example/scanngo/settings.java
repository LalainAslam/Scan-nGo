package com.example.scanngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class settings extends AppCompatActivity {
    private Button button6;
    private Button button7;
    private Button button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        button6= (Button) findViewById(R.id.button6);
        button7= (Button) findViewById(R.id.button7);
        button8= (Button) findViewById(R.id.button8);

        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v4)
            {
                openAccount();
            }
        });
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v5)
            {
                openAbout();
            }
        });
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v6)
            {
                openPrivacyPolicy();
            }
        });
    }

    public void openAccount()
    {
        Intent intent4 = new Intent(this, account.class);
        startActivity(intent4);
    }



    public void openAbout()
    {
        Intent intent5 = new Intent(this, about.class);
        startActivity(intent5);
    }

    public void openPrivacyPolicy()
    {
        Intent intent6 = new Intent(this, PrivacyPolicy.class);
        startActivity(intent6);
    }
}