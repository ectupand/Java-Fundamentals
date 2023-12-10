package oop.company.professions;

import oop.Person;

public class Driver extends Person {
    private final String fullName;
    private int experience;

    public Driver(String fullName, Integer experience) {
        this.fullName = fullName;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public int getExperience() {
        return experience;
    }
}
