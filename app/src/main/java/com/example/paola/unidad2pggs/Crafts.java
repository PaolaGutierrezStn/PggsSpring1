package com.example.paola.unidad2pggs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Crafts extends AppCompatActivity {

    public void nextActivity66(View view){
        startActivity(new Intent(this, Map.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crafts);
    }
}
