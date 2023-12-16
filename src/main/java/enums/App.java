package enums;
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
    }
}



