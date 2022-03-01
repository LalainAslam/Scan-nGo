package com.example.scanngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
private ImageButton button;
    private ImageButton button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (ImageButton) findViewById(R.id.button);
        button2= (ImageButton) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openMainActivity2();
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v3)
            {
                openSettings();
            }
        });
    }

    public void openMainActivity2()
    {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }



    public void openSettings()
    {
        Intent intent3 = new Intent(this, settings.class);
        startActivity(intent3);
    }
}