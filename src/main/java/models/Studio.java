package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="studios")

public class Studio {

    //IV
    private int id;
    private String parentCompany;
    private String studioname;
    private int datefounded;
    private Owner owner;
    private List<Director> directors;

    // Constructor
    public Studio(String parentCompany, String studioname, int datefounded) {
        this.parentCompany = parentCompany;
        this.studioname = studioname;
        this.datefounded = datefounded;
        this.directors = new ArrayList<Director>();
    }

    //Getters and Setters


   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="id")
   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParentCompany() {
        return parentCompany;
    }

    public void setParentCompany(String parentCompany) {
        this.parentCompany = parentCompany;
    }

    public String getStudioname() {
        return studioname;
    }

    public void setStudioname(String studioname) {
        this.studioname = studioname;
    }

    public int getDatefounded() {
        return datefounded;
    }

    public void setDatefounded(int datefounded) {
        this.datefounded = datefounded;
    }

    @OneToOne(mappedBy="studio")
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name="studio_director",
    joinColumns = {@JoinColumn(name="studio_id", nullable = false, updatable = false)},
    inverseJoinColumns = {@JoinColumn(name ="director_id", nullable = false, updatable = false)})
    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    // METHODS

    public void addDirectorToStudio(Director director){
        this.directors.add(director);
    }
}
