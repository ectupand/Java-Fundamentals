package oop.people;

public class Student extends Person {
    private String group;
    private static final String DEFAULT_GROUP = "Group";
    private final double averageMark;

    public double getAverageMark() {
        return averageMark;
    }

    public Student (double averageMark, String fullName, int age){
        super(fullName, age);
        this.averageMark = averageMark;
        this.group = DEFAULT_GROUP;
    }

    public int getScholarship(){
        if (getAverageMark() == 5){
            return 2000;
        }
        return 1900;
    }

}
