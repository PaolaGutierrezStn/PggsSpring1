package com.example.paola.unidad2pggs;

public class Photo {
    private int imageId;
    private String namePlace;

    public Photo(int imageId, String namePlace){
        this.imageId = imageId;
        this.namePlace = namePlace;
    }

    public Photo(){
        this(R.mipmap.ic_launcher_round, "unamedplace");
    }

    public int getImageId() {
        return imageId;
    }

    public String getNamePlace() {
        return namePlace;
    }
}
