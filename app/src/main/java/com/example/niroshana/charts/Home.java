package com.example.niroshana.charts;

import android.app.Fragment;
import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends FragmentActivity {

    private Button temperature,light,humidity,soilMoisture;
    private int mContainerId;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        temperature = (Button) findViewById(R.id.btnTemp);
        light = (Button) findViewById(R.id.btnLight);
        humidity = (Button) findViewById(R.id.btnHum);
        soilMoisture = (Button) findViewById(R.id.btnSoil);



        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* TempFragment fragment = null;
                fragment = new TempFragment();


                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.output, fragment);
                transaction.commit();*/





            }
        });
        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              


            }
        });


    }
}
