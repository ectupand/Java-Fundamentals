package internet;

import internet.market.Basket;
import internet.market.Product;

public class App {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product("Apple Watch Series 8", 399, 4.7F),
                new Product("Apple AirPods Pro", 299, 4.6F),
                new Product("Bose QuietComfort 45 Headphones", 329, 4.5F),
                new Product("Google Pixel 7 Pro", 899),
                new Product("Huawei MateBook 14", 999, 4.7F),
                new Product("LG OLED C2 TV", 1999),
                new Product("PlayStation 5 Console", 499, 4.9F),
                new Product("Microsoft Surface Pro 8", 999, 4.8F),
        };
        Basket basket1 = new Basket(products);
        Basket basket2 = new Basket(new Product[]{products[5], products[4]});
        Basket basket3 = new Basket();

        User[] users = new User[]{
                new User("admin", "admin", basket1),
                new User("qwerty", "12345", basket2),
                new User("Mary", "2000", basket3)
        };
        System.out.println("Catalogue:");
        for (Product product : products) {
            System.out.println(product.toString());
        }
        System.out.println("------------------------");
        for (User user : users){
            System.out.println(user.getBasketToString());
            System.out.println("------------------------");
        }

    }
}
