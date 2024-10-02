package Model;

public class Pan extends KitchenProduct{

    private Double capacity;

    public Pan(String name, Integer stock, Double price, Double capacity) {
        super(name, stock, price);
        this.capacity = capacity;
    }

    public Pan() {
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Pans{" +
                "capacity=" + capacity +
                '}';
    }

    @Override
    public Double calculatePrice(Double percentage){
        return getPrice() * percentage;
    }

}
