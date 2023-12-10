package oop;

import oop.company.details.Engine;
import oop.company.professions.Driver;
import oop.company.vehicles.Car;
import oop.people.Aspirant;
import oop.people.Person;
import oop.people.Student;

public class App {
    public static void main(String[] args) {
        System.out.println("-----------1-----------");
        Person defaultPerson = new Person();
        Person person = new Person("A", 9);
        defaultPerson.move();
        defaultPerson.talk();
        person.move();
        person.talk();
        System.out.println("-----------2-----------");

        Student studentExcellent = new Student(5, "Excellent Student", 1);
        Student studentAvg = new Student(4, "Average Student", 9);
        Aspirant aspirantExcellent = new Aspirant(5, "Excellent Aspirant", 11);
        Aspirant aspirantAvg = new Aspirant(4, "Average Aspirant", 19);
        Student[] students = new Student[4];
        students[0] = studentAvg;
        students[1] = studentExcellent;
        students[2] = aspirantAvg;
        students[3] = aspirantExcellent;
        for (Student student : students){
            System.out.println(student.getClass().getName() + " "
                    + student.getAverageMark() + " : "
                    + student.getScholarship()
            );
        }
        System.out.println("-----------3-----------");

        Driver driver = new Driver("Aboss", 9);
        Engine engine = new Engine(999, "Naberezhny Chelnhy");
        Car car = new Car(" 2022 Acura TLX",
                "Sedan",
                3.770,
                driver,
                engine
                );
        System.out.println(car);

    }

}
