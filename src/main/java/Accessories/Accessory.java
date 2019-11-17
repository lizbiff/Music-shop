package Accessories;

import Shop.ShopItem;

public abstract class Accessory extends ShopItem {

    private String type;

    public Accessory(double boughtPrice, double sellPrice, String type){
        super(boughtPrice, sellPrice);
        this.type = type;
    }

    public String getAccessoryType(){
     return this.type;
    }
}
