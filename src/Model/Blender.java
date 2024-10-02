package Model;

import Interface.Offer;

public class Blender extends KitchenProduct implements Offer {

    private Type type;

    public Blender(String name, Integer stock, Double price, Type type) {
        super(name, stock, price);
        this.type = type;
    }

    public Blender() {
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Blender{" +
                "type=" + type +
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
