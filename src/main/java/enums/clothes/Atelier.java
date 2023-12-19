package enums.clothes;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Atelier extends Clothes implements FemaleClothes, MaleClothes{
    public void dressFemale(Clothes[] clothes) {
        ArrayList<String>aboutSexClothes = dressSomeone(clothes, "Female");
        aboutSexClothes.forEach(System.out::println);
    }


    private ArrayList<String> dressSomeone(Clothes[] clothes, String sex) {
        ArrayList<Clothes> sexClothes = new ArrayList<>();
        outerloop:
        for (Clothes cloth : clothes) {
            Class<? extends Clothes> clothClass = cloth.getClass();
            Method[] methods = clothClass.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getName().contains(sex)) {
                    sexClothes.add(cloth);
                    continue outerloop;
                }
            }
        }
        ArrayList<String> about = new ArrayList<>();
        for (Clothes sexCloth : sexClothes){
            about.add(sexCloth.getClass().getSimpleName() + ", "
                    + sexCloth.getEuroSize() + ", "
                    + sexCloth.getColor() + ", "
                    + sexCloth.getCost()
            );
        }
        return about;
    }

    public void dressMale(Clothes[] clothes) {
        ArrayList<String>aboutSexClothes = dressSomeone(clothes, "Male");
        aboutSexClothes.forEach(System.out::println);
        }
}
