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

    @OneToOne(fetch = FetchType.LAZY) // this () is the same as the deafult setting if left out, but explicity include for consistency)
    @JoinColumn(name="studio_id", nullable = false) // Owner will be holding the foreign key of the studio - which will be put into a Join column in the Owner table called "studio_id"
    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }
}
