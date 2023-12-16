package enums.seasons;

public class AboutSeason{
    private final Season bestSeason = Season.SPRING;

    public void sayLove(Season season){
        switch (season.name) {
            case "winter" -> System.out.println("I like vinter");
            case "spring" -> System.out.println("I love MAY MONTH");
            case "summer" -> System.out.println("I love holidays");
            case "fall" -> System.out.println("I love cutting");
        }
    }
}
