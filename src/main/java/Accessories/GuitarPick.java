package Accessories;

import Instruments.Guitar;

public class GuitarPick extends Accessory{
    private String colour;
    private int thickness;

    public GuitarPick(String colour, int thickness){
        super(.50, 1.00, "Guitar Accessory");
        this.colour = colour;
        this.thickness = thickness;
    }

    public String getAccessoryColour(){
        return this.colour;
    }

    public int getThickness(){
        return this.thickness;
    }

}
