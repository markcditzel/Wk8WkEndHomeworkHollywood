package models;

import javax.persistence.*;

// Annotate for Hibernate db functionality
@Entity
@Table(name="owners") // use the plural of the class name for labelling the db table
public class Owner extends Person{

    //IV
    private Studio studio;

    // Constructor
     public Owner(String name, int age, Gender gender, double salary, boolean employmentStatus, Studio studio) {
        super(name, age, gender, salary, employmentStatus);
        this.studio = studio;
    }

    @OneToOne
    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }
}
