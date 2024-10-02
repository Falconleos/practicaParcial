package Model;

public class Oven extends KitchenProduct{

    private Double high;
    private Double width;

    public Oven(String name, Integer stock, Double price, Double high, Double width) {
        super(name, stock, price);
        this.high = high;
        this.width = width;
    }

    public Oven() {
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Oven{" +
                "high=" + high +
                ", width=" + width +
                '}';
    }

    @Override
    public Double calculatePrice(Double percentage){
        return getPrice() * percentage;
    }

}
