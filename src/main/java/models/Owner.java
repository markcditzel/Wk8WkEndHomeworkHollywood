package models;

import javax.persistence.*;

// Annotate for Hibernate db functionality
@Entity
@Table(name="owners") // use the plural of the class name for labelling the db table
public class Owner extends Person {

    //IV
    private Temperament temperament;
    private Studio studio;

    // Constructor
    public Owner(String name, int age, Gender gender, double salary, boolean employmentStatus, Temperament temperament, Studio studio){
        super(name, age, gender, salary, employmentStatus);
        this.temperament = temperament;
        this.studio = studio;
    }

    @Enumerated(value = EnumType.STRING)
    public Temperament getTemperament() {
        return temperament;
    }

    public void setTemperament(Temperament temperament) {
        this.temperament = temperament;
    }

    @OneToOne
    @JoinColumn(name = "studio_id", nullable = false)
    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }
}

