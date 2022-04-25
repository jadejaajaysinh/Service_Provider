package com.example.service_provider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SPActivity extends AppCompatActivity
{

    CardView c1,c2,c3,c4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spactivity);

        c1=findViewById(R.id.sc1);
        c2=findViewById(R.id.sc2);
        c3=findViewById(R.id.sc3);
        c4=findViewById(R.id.sc4);

        c1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i2 = new Intent(SPActivity.this,Detail.class);
                startActivity(i2);

            }
        });

        c2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i2 = new Intent(SPActivity.this,Detail.class);
                startActivity(i2);

            }
        });

        c3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i3 = new Intent(SPActivity.this,Detail.class);
                startActivity(i3);

            }
        });

        c4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent i4 = new Intent(SPActivity.this,Detail.class);
                startActivity(i4);

            }
        });

    }
}