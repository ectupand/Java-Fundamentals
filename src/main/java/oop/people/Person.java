package oop.people;

public class Person {
    private static final String DEFAULT_NAME = "Adol";
    private static final int DEFAULT_AGE = 9;

    private String fullName;
    private int age;

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public Person(){
        this.fullName = DEFAULT_NAME;
        this.age = DEFAULT_AGE;
    }

    public String getFullName(){
        return fullName;
    }
    public Integer getAge(){
        return age;
    }

    public void move(){
        System.out.println(getFullName()+" says");
    }
    public void talk(){
        move();
    }

}
