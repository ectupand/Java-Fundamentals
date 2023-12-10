package oop.people;


public class Aspirant extends Student {

    public Aspirant(double averageMark, String fullName, int age){
        super(averageMark, fullName, age);
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 2500;
        }
        return 2200;
    }
}
