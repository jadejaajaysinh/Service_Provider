package com.example.service_provider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity
{
    CardView c1,c2,c3,c4,c5,c6,c7,c8;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=findViewById(R.id.cdv1);
        c2=findViewById(R.id.cdv2);
        c3=findViewById(R.id.cdv3);
        c4=findViewById(R.id.cdv4);
        c5=findViewById(R.id.cdv5);
        c6=findViewById(R.id.cdv6);
        c7=findViewById(R.id.cdv7);
        c8=findViewById(R.id.cdv8);

        c1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i);
            }
        });

        c2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i);
            }
        });

        c3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i);
            }
        });

        c4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i);
            }
        });

        c5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i);
            }
        });

        c6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i);
            }
        });

        c7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i);
            }
        });

        c8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(MainActivity.this,SPActivity.class);
                startActivity(i);
            }
        });

    }
}