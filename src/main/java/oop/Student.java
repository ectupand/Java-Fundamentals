package oop;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private final double averageMark;

    public double getAverageMark() {
        return averageMark;
    }

    public Student (double averageMark){
        this.averageMark = averageMark;
    }

    public int getScholarship(){
        if (getAverageMark() == 5){
            return 2000;
        }
        return 1900;
    }

}
