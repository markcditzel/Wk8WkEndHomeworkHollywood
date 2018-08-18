package models;

import db.Gender;

public class Owner extends Person{

    //IV

    private Studio studio;

    public Owner(String name, int age, Gender gender, double salary, boolean employmentStatus, Studio studio) {
        super(name, age, gender, salary, employmentStatus);
        this.studio = studio;
    }
}
