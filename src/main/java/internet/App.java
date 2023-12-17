package internet;

import internet.market.Category;
import internet.market.Product;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static void main(String[] args) {
        Product.sortByCategory();
        Product.getCategories();
        Product.setCategories();

        System.out.println("Enter login and password");
        Scanner in = new Scanner(System.in);
        System.out.println("Login: ");
        String login = in.nextLine();
        System.out.println("Password: ");
        String password = in.nextLine();
        ArrayList<Product> basket = new ArrayList<>();
        User user = new User(login, password, basket, 1000);

        /*printCatalogue(catalogues);
        String catalogueName;
        ArrayList<Product> basketList = new ArrayList<>();
        while (!Objects.equals(catalogueName = in.nextLine(), "exit")){
            for (Category catalogue : catalogues){
                if (Objects.equals(catalogue.getName(), catalogueName)){
                    AtomicInteger index = new AtomicInteger(1);
                    Arrays.stream(catalogue.getProducts())
                            .map(i -> index.getAndIncrement())
                            .map(i -> "" + i + ". " + catalogue.getProducts()[i-1]
                                    +", " + catalogue.getProducts()[i-1].getPrice())
                            .forEach(System.out::println);
                    System.out.println("Anything interesting? (yes/no)");
                    String interested = in.nextLine();
                    if (Objects.equals(interested, "yes")){
                        System.out.println("What exactly? Enter a number");
                        int productIndex = in.nextInt()-1;
                        Product toBuy = catalogue.getProducts()[productIndex];
                        if (user.buy(toBuy.getPrice())){
                            basketList.add(toBuy);
                            user.setBasket(basketList);
                            System.out.println("Added to basket. Money left: " + user.getWallet());
                            printCatalogue(catalogues);
                        }else{
                            System.out.println("Not enough money");
                            printCatalogue(catalogues);
                        }
                    }else if(Objects.equals(interested, "no")){
                        printCatalogue(catalogues);
                        break;
                    }
                }
            }
        }
        user.total();
*/
        //testCheckout();
    }
    private static void testCheckout(){
        ArrayList<Product> basket= new ArrayList<>(Arrays.asList(
                Product.APPLE_AIRPODS_PRO,
                Product.BOSE_QUIETCOMFORT_45_HEADPHONES)
        );
        User user = new User("admin", "admin", basket, 1000);
        user.total();
    }

    private static void printCatalogue(Category[] catalogues){
        System.out.println("Available catalogues:");
        Arrays.stream(catalogues).forEach(System.out::println);
        System.out.println("Enter preferred catalogue or type exit to quit:");
    }
}
