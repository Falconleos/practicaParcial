package Model;

public abstract class KitchenProduct {

    protected static Integer contador = 0;

    private Integer id;
    private String name;
    private Integer stock;
    private Double price;

    public KitchenProduct(String name, Integer stock, Double price) {
        this.id = contador++;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public KitchenProduct() {
        this.id = contador++;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract Double calculatePrice(Double percentage);

    @Override
    public String toString() {
        return "KitchenProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }

}
