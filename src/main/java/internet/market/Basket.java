package internet.market;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> basket = new ArrayList<>();

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public void add(Product product){
        basket.add(product);
    }
}
