package internet.market;

import java.util.Arrays;

public class Basket {
    private Product[] boughtProducts;

    public Basket(Product[] boughtProducts) {
        this.boughtProducts = boughtProducts;
    }
    public Basket() {
    }

    @Override
    public String toString() {
        return Arrays.toString(boughtProducts);
    }
}
