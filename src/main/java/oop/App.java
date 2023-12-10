package oop;

public class App {
    public static void main(String[] args) {
        System.out.println("-----------1-----------");
        new Person().move();
        new Person().talk();
        new Person("A", 9).move();
        new Person("A", 9).talk();
        System.out.println("-----------2-----------");

        Student studentExcellent = new Student(5);
        Student studentAvg = new Student(4);
        Aspirant aspirantExcellent = new Aspirant(5);
        Aspirant aspirantAvg = new Aspirant(4);
        Student[] students = new Student[4];
        students[0] = studentAvg;
        students[1] = studentExcellent;
        students[2] = aspirantAvg;
        students[3] = aspirantExcellent;
        for (Student student : students){
            System.out.println(student.getClass().getName() + " " + student.getAverageMark() + " : " + student.getScholarship());
        }
    }

}
