package com.example.paola.unidad2pggs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Parking {
    private int imageId;
    private String nameParking;
    private String price;

    public Parking(int imageId, String nameParking, String price){
        this.imageId = imageId;
        this.nameParking = nameParking;
        this.price = price;
    }

    public Parking(){
        this(R.mipmap.ic_launcher_round, "unnameparking", "unprice");
    }

    public int getImageId(){ return imageId;}

    public String getNameParking(){ return nameParking; }

    public String getPrice(){ return price; }
}
