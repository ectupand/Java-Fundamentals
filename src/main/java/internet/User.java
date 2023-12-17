package internet;

import internet.market.Product;

import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private final String login;
    private String password;
    private ArrayList<Product> basket;
    private int wallet;

    public User(String login, String password, ArrayList<Product> basket, int wallet){
        this.login = login;
        this.password = password;
        this.basket = basket;
        this.wallet = wallet;
    }

    public void setBasket(ArrayList<Product> basket) {
        this.basket = basket;
    }

    public String getBasket() {
        return basket.toString();
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
        System.out.println("Money left: "
                + getWallet()
                + "\nBasket:\n"
                + getBasket()
        );

    }
}
