package models;

import db.Gender;

import java.util.EnumMap;

public abstract class Person {

    //IV
    private String name;
    private int age;
    private Gender gender;
    private double salary;
    private boolean employmentStatus; // very generalised staus, not linked to a specific film - so good for abstract Class

    // Constructor
    // Takes all IV in constructor
    // Every person has name, age, sex, gender, salary, empStatus
    public Person(String name, int age, Gender gender, double salary, boolean employmentStatus) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.employmentStatus = employmentStatus;
    }

    // For DB functionality - all IV elements need GETTER and SETTERS

    /* For JAVA-only: What is going to change? Age, salary, empStatus
    So they all will need setters


    FOR JAVA-only: What is going to be accessed - All
    So they all need getters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(boolean employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
}
