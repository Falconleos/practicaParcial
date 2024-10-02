package Model;

import Interface.Offer;

public class Knife extends KitchenProduct implements Offer {

    private String sheetMaterial;

    public Knife(String name, Integer stock, Double price, String sheetMaterial) {
        super(name, stock, price);
        this.sheetMaterial = sheetMaterial;
    }

    public Knife() {
    }

    public String getSheetMaterial() {
        return sheetMaterial;
    }

    public void setSheetMaterial(String sheetMaterial) {
        this.sheetMaterial = sheetMaterial;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Knives{" +
                "sheetMaterial='" + sheetMaterial + '\'' +
                '}';
    }

    @Override
    public Double calculatePrice(Double percentage){
        return getPrice() * percentage;
    }

    @Override
    public Double offerDiscount(Double percentage){
        return getPrice() * (1 - percentage/100);
    }
}
