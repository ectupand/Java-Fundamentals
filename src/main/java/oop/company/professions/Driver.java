package oop.company.professions;

import oop.people.Person;

public class Driver extends Person {
    private int experience;

    public Driver(String fullName, Integer experience) {
        super(fullName, 19);
        this.experience = experience;
    }

    public String getFullName() {
        return super.getFullName();
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString(){
        return (this.getFullName() + ", " + this.getExperience() + " year(s)");
    }
}
