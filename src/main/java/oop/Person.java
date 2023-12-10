package oop;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public Person(){}

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
        System.out.println(getFullName()+" says");
    }

}
