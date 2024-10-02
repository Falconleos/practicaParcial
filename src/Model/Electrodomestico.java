package Model;

public abstract class Electrodomestico extends KitchenProduct{

    public Electrodomestico(String name, Integer stock, Double price) {
        super(name, stock, price);
    }

    public Electrodomestico() {
    }

    @Override
    public String toString() {
        return super.toString() +
                "Electrodomestico{}";
    }
}
