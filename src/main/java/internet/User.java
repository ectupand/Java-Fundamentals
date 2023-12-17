package internet;

import internet.market.Product;

import java.util.ArrayList;

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

    public ArrayList<Product> getBasket() {
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
        System.out.println("Money left: "
                + getWallet()
                + "\nBasket:\n"
                + getBasket()
        );
        int firstColumnLength = 0;
        /*if (!getBasket().isEmpty()){
            //for (String product : getBasket().toString().substring(1,  getBasket().toString().length()-1).split(", ")){
            for (Product product : getBasket()){
                if (product.getName().length() > firstColumnLength){
                    firstColumnLength = product.getName().length();
                }
                if (product.)
            }
            firstColumnLength +=5;
        }*/
        //System.out.format("%"+firstColumnLength+"s%"+
        System.out.format("%12s%10s%16s", "string1", "int1", "string2");
    }
}
