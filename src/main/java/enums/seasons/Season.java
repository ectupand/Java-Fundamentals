package enums.seasons;

public enum Season {
    WINTER("winter", -11.5, "cold ice tea"),
    SPRING("spring", 4.4, "happy birtday"),
    SUMMER("summer", 16.8, "school breaked") {
        @Override
        public String getDescription() {
            return "Warm time years";
        }
    },
    FALL("fall", 1.5, "depressision period");
    final String name;
    final double avgTemp;
    final String info;

    Season(String name, double avgTemp, String info) {
        this.name = name;
        this.avgTemp = avgTemp;
        this.info = info;
    }

    public String getDescription() {
        return "Cold time years";
    }
    public String getName() {
        return name;
    }

    public double getAvgTemp() {
        return avgTemp;
    }
}
