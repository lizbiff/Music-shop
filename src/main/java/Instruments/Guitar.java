package Instruments;

public class Guitar extends Instrument{
    private int noOfStrings;

    public Guitar(double boughtPrice, double sellPrice, String colour, String material, String type,int noOfStrings){
        super(boughtPrice, sellPrice, colour, material, type);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings(){
        return this.noOfStrings;
    }
    public String makeNoise(String data) {
        return playSound(data);
    }

}
