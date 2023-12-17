package internet.market;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public enum Product {
    IPHONE_13_PRO("iPhone 13 Pro", 1099, 5F),
    APPLE_AIRPODS_PRO("Apple AirPods Pro", 299, 4.6F),
    BOSE_QUIETCOMFORT_45_HEADPHONES("Bose QuietComfort 45 Headphones", 329, 4.5F),
    GOOGLE_PIXEL_7_PRO("Google Pixel 7 Pro", 899, null),
    HUAWEI_MATEBOOK_14("Huawei MateBook 14", 999, 4.7F),
    LG_OLED_C2_TV("LG OLED C2 TV",  1999, null),
    PLAYSTATION_5_CONSOLE("PlayStation 5 Console", 499, 4.9F),
    MICROSOFT_SURFACE_PRO_8("Microsoft Surface Pro 8", 999, 4.8F);
    private final String name;
    private final int price;
    private Float rating;

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

}
