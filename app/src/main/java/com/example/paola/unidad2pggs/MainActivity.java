package com.example.paola.unidad2pggs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextActivity1(View view){
        startActivity(new Intent(this, RouteDH.class));
    }

    public void nextActivity2(View view){
        startActivity(new Intent(this, PhotoDH.class));
    }

    public void nextActivity3(View view){
        startActivity(new Intent(this, ParkingDH.class));
    }

    public void nextActivity4(View view){
        startActivity(new Intent(this, History.class));
    }

    public void nextActivity5(View view){
        startActivity(new Intent(this, Statistic.class));
    }

    public void nextActivity6(View view){
        startActivity(new Intent(this, Crafts.class));
    }
    
}
