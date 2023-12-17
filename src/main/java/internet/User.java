package internet;

import internet.market.Basket;
import internet.market.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class User {
    private final String login;
    private String password;
    private Basket basket;
    private int wallet;

    public User(String login, String password, Basket basket, int wallet){
        this.login = login;
        this.password = password;
        this.basket = basket;
        this.wallet = wallet;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Basket getBasket() {
        return basket;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public boolean buy(int price){
        int newWallet;
        if ((newWallet = getWallet()-price) >= 0){
            setWallet(newWallet);
            return true;
        }else{
            return false;
        }
    }

    public void total(){
        LocalDate todayDate = LocalDate.now();

        int firstColumnLength = 0;
        if (!getBasket().getBasket().isEmpty()){
            for (Product product : getBasket().getBasket()){
                if (product.getName().length() > firstColumnLength){
                    firstColumnLength = product.getName().length();
                }
            }
            firstColumnLength +=2;
        }
        String checkoutDate = "%s%"+(firstColumnLength)+"tD%n";
        String header = "%"+firstColumnLength+"s%9s%n";
        String body = "%"+firstColumnLength+"s%9d%n";
        System.out.format(checkoutDate, "Date:", todayDate);
        System.out.format(header, "Products", "Cost");
        System.out.println(IntStream.range(0, firstColumnLength+9).mapToObj(i -> "-").collect(Collectors.joining("")));
        for (Product product : getBasket().getBasket()) {
            System.out.format(body, product.getName(), product.getPrice());
        }
        System.out.println(IntStream.range(0, firstColumnLength+9).mapToObj(i -> "-").collect(Collectors.joining("")));
        System.out.format(body, "Total:", getWallet());
    }
}
