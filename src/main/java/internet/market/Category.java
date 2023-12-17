package internet.market;

import java.util.ArrayList;
import java.util.Arrays;

public class Category {
    private final String name;
    private Product[] products;

    public Category(String name, Product[] products){
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }
    public Product[] getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return name;
    }

}
