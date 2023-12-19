package enums;
import enums.clothes.*;
import enums.seasons.Season;

public class App {
    public static void main(String[] args) {
        for (Season season : Season.values()){
            System.out.println(
                    season.getName() + " "
                    + season.getAvgTemp() + " "
                    + season.getDescription() + " "
            );
        }

        System.out.println("------------------------------");
        Atelier atelier = new Atelier();
        atelier.dressFemale(new Clothes[]{
                new Skirt(),
                new Necktie(),
                new TShirt(),
                new Pants(),
                new Skirt()
        });

    }
}



