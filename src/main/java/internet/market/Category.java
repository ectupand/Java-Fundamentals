package internet.market;

import java.util.ArrayList;
import java.util.Arrays;

public class Category {
    private final String name;
    private Product[] products;
    private static ArrayList<Product> phones = new ArrayList<>();
    private static ArrayList<Product> earphones = new ArrayList<>();
    private static ArrayList<Product> laptops = new ArrayList<>();
    private static ArrayList<Product> etc = new ArrayList<>();
    private static ArrayList<ArrayList<Product>> categories = new ArrayList<>();

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

    public static ArrayList<Product> getLaptops() {
        return laptops;
    }
    public static ArrayList<Product> getPhones() {
        return phones;
    }
    public static ArrayList<Product> getEarphones() {
        return earphones;
    }
    public static ArrayList<Product> getEtc() {
        return etc;
    }
    public static void getCategories(){
        System.out.println(categories.toString());
    }
    public static void setCategories() {
        categories = new ArrayList<>(Arrays.asList(phones, earphones, laptops, etc));
    }
    public static void sortByCategory(){
        for (Product product: Product.values()){
            switch (product.getCategory()) {
                for (String category : categories){
                    case category -> category.add(product);
                }

                case "phones" -> phones.add(product);
                case "earphones" -> earphones.add(product);
                case "laptops" -> laptops.add(product);
                case null -> etc.add(product);
                default -> {};
            }
        }
    }
}
