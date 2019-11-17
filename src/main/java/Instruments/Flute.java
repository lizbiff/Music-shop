package Instruments;

public class Flute extends Instrument{
    private int noOfKeys;
    private String make;

    public Flute(double boughtPrice, double sellPrice, String colour, String material, String type,int noOfKeys, String make){
        super(boughtPrice, sellPrice, colour, material, type);
        this.noOfKeys = noOfKeys;
        this.make = make;
    }

    public int getNoOfKeys(){
        return this.noOfKeys;
    }

    public String getMake(){
        return this.make;
    }

    public String makeNoise(String data) {
        return playSound(data);
    }

}

