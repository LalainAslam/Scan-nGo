package com.example.scanngo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageButton button;
    private ImageButton button2;
    Button open;
    ImageView imageView;
    Button raju;
    Button ayan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button= (ImageButton) findViewById(R.id.button);
        button2= (ImageButton) findViewById(R.id.button2);
        open= findViewById(R.id.open);
        imageView=findViewById(R.id.imageView);
        raju=findViewById(R.id.raju);
        ayan =findViewById(R.id.ayan);


        if(ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this,
                    new String[]{Manifest.permission.CAMERA},101);
        }

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 101);
            }
        });




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
        raju.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v7)
            {
                openRaju();
            }
        });
        ayan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v8)
            {
                openAyan();
            }
        });
    }

    public void openMainActivity2()
    {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openRaju()
    {
        Intent intent7 = new Intent(this, com.example.scanngo.ayan.class);
        startActivity(intent7);
    }
    public void openAyan()
    {
        Intent intent8 = new Intent(this, com.example.scanngo.raju.class);
        startActivity(intent8);
    }



    public void openSettings()
    {
        Intent intent3 = new Intent(this, settings.class);
        startActivity(intent3);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==101)
        {
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        }

    }

}