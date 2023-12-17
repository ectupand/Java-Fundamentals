package internet.market;

public class Product {
    private String name;
    private int price;
    private float rating;

    public Product(String name, int price, float rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
