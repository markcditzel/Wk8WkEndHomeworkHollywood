package models;

import javax.persistence.*;

// Annotate for Hibernate db functionality
@Entity
@Table(name="owners") // use the plural of the class name for labelling the db table
public class Owner extends Person {

    //IV

    // Constructor
    public Owner(String name, int age, Gender gender, double salary, boolean employmentStatus) {
        super(name, age, gender, salary, employmentStatus);
    }
}

