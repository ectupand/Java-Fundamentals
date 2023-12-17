package internet.market;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public enum Product {
    IPHONE_13_PRO("iPhone 13 Pro", 1099, "phones", 5F),
    APPLE_AIRPODS_PRO("Apple AirPods Pro", 299, "earphones", 4.6F),
    BOSE_QUIETCOMFORT_45_HEADPHONES("Bose QuietComfort 45 Headphones", 329, "earphones", 4.5F),
    GOOGLE_PIXEL_7_PRO("Google Pixel 7 Pro", 899, "phones", null),
    HUAWEI_MATEBOOK_14("Huawei MateBook 14", 999, "laptops", 4.7F),
    LG_OLED_C2_TV("LG OLED C2 TV",  1999, null),
    PLAYSTATION_5_CONSOLE("PlayStation 5 Console", 499, 4.9F),
    MICROSOFT_SURFACE_PRO_8("Microsoft Surface Pro 8", 999, "laptops", 4.8F);

    private final String name;
    private final int price;
    private String category;
    private Float rating;
    private static ArrayList<Product> phones = new ArrayList<>();
    private static ArrayList<Product> earphones = new ArrayList<>();
    private static ArrayList<Product> laptops = new ArrayList<>();
    private static ArrayList<Product> etc = new ArrayList<>();
    private static ArrayList<ArrayList<Product>> categories = new ArrayList<>();

    Product(String name, int price, String category, Float rating) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.rating = rating;
    }
    Product(String name, int price, Float rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }


    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return (category == null) ? null : category;
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
    public static void getCategories(){
        System.out.println();
    }

    public static void setCategories() {
       categories = new ArrayList<>(Arrays.asList(phones, earphones, laptops, etc));
    }
}
