package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;
import Shop.ShopItem;

public abstract class Instrument extends ShopItem implements IPlay {

    private String colour;
    private String material;
    private String type;

    public Instrument(double boughtPrice, double sellPrice, String colour, String material, String type){
        super(boughtPrice, sellPrice);
        this.colour = colour;
        this.material = material;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    public String playSound(String sound) {
        return "Playing: " + sound;
    }


}
