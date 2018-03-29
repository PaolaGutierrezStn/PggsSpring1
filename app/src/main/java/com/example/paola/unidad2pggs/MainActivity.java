package com.example.paola.unidad2pggs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextActivity1(View view){
        startActivity(new Intent(this, RouteDhActivity.class));
    }

    public void nextActivity2(View view){
        startActivity(new Intent(this, PhotoGalleryActivity.class));
    }

    public void nextActivity3(View view){
        startActivity(new Intent(this, ParkingDhActivity.class));
    }

    public void nextActivity4(View view){
        startActivity(new Intent(this, HistoryActivity.class));
    }

    public void nextActivity5(View view){
        startActivity(new Intent(this, StatisticActivity.class));
    }

    public void nextActivity6(View view){
        startActivity(new Intent(this, CraftsVideoActivity.class));
    }
    
}
