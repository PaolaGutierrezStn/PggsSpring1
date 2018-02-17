package com.example.paola.unidad2pggs;

/**
 * Created by Paola on 15/02/2018.
 */

public class Route {
    private int imageId;
    private String nameRoute;
    private String description;

    public Route(int imageId, String nameRoute, String description){
        this.imageId = imageId;
        this.nameRoute = nameRoute;
        this.description = description;
    }

    public Route(){
        this(R.mipmap.ic_launcher_round, "unnameroute", "undescription");
    }

    public int getImageId(){ return imageId;}

    public String getNameRoute(){ return nameRoute; }

    public String getDescription(){ return description; }
}
