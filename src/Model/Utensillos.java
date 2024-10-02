package Model;

public abstract class Utensillos extends KitchenProduct {

    private String manufacturer;

    public Utensillos(String name, Integer stock, Double price, String manufacturer) {
        super(name, stock, price);
        this.manufacturer = manufacturer;
    }

    public Utensillos() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Utensillos{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }

}

