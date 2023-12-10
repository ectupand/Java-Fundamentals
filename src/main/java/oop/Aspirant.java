package oop;

public class Aspirant extends Student {

    public Aspirant(double averageMark){
        super(averageMark);
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 2500;
        }
        return 2200;
    }
}
