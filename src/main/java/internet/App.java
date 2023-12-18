package internet;

import internet.market.Basket;
import internet.market.Category;
import internet.market.Product;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static void main(String[] args) {
        Category phones = new Category("phones", new Product[]{
                Product.GOOGLE_PIXEL_7_PRO,
                Product.IPHONE_13_PRO
        });
        Category earphones = new Category("earphones", new Product[]{
                Product.APPLE_AIRPODS_PRO,
                Product.BOSE_QUIETCOMFORT_45_HEADPHONES
        });
        Category laptops = new Category("laptops", new Product[]{
                Product.HUAWEI_MATEBOOK_14,
                Product.MICROSOFT_SURFACE_PRO_8
        });
        Category etc = new Category("etc", new Product[]{
                Product.LG_OLED_C2_TV,
                Product.PLAYSTATION_5_CONSOLE
        });
        Category[] categories = new Category[]{phones, earphones, laptops, etc};

        System.out.println("Enter login and password");
        Scanner in = new Scanner(System.in);
        System.out.println("Login: ");
        String login = in.nextLine();
        System.out.println("Password: ");
        String password = in.nextLine();
        Basket basket = new Basket();
        int budget = 1000;
        User user = new User(login, password, basket, budget);

        printCatalogue(categories);
        String categoryName;
        while (!Objects.equals(categoryName = in.nextLine(), "exit")){
            for (Category category : categories){
                if (Objects.equals(category.getName(), categoryName)){
                    AtomicInteger index = new AtomicInteger(1);
                    Arrays.stream(category.getProducts())
                            .map(i -> index.getAndIncrement())
                            .map(i -> i + ". " + category.getProducts()[i-1]
                                    +", " + category.getProducts()[i-1].getPrice())
                            .forEach(System.out::println);
                    System.out.println("Anything interesting? (yes/no)");
                    String interested = in.nextLine();
                    if (Objects.equals(interested, "yes")){
                        System.out.println("What exactly? Enter a number");
                        int productIndex = in.nextInt()-1;
                        Product toBuy = category.getProducts()[productIndex];
                        if (user.buy(toBuy.getPrice())){
                            basket.add(toBuy);
                            user.setBasket(basket);
                            System.out.println("Added to basket. Money left: " + user.getWallet());
                            printCatalogue(categories);
                        }else{
                            System.out.println("Not enough money");
                            printCatalogue(categories);
                        }
                    }else if(Objects.equals(interested, "no")){
                        printCatalogue(categories);
                        break;
                    }
                }
            }
        }
        user.total(budget);

        //testCheckout();
    }
    private static void testCheckout(){
        Basket basket = new Basket();
        int budget = 1000;
        basket.add(Product.APPLE_AIRPODS_PRO);
        basket.add(Product.BOSE_QUIETCOMFORT_45_HEADPHONES);
        User user = new User("admin", "admin", basket, budget);
        user.total(budget);
    }

    private static void printCatalogue(Category[] catalogues){
        System.out.println("Available catalogues:");
        Arrays.stream(catalogues).forEach(System.out::println);
        System.out.println("Enter preferred catalogue or type exit to quit:");
    }
}
