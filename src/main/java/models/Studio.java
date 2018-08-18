package models;

import javax.persistence.*;

@Entity
@Table(name="studios")

public class Studio {

    //IV
    private int id;
    private String parentCompany;
    private String studioname;
    private int datefounded;
    private Owner owner;

    // Constructor
    public Studio(String parentCompany, String studioname, int datefounded) {
        this.parentCompany = parentCompany;
        this.studioname = studioname;
        this.datefounded = datefounded;
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

    @OneToOne(mappedBy = "studio") // owner holds the studio's FK
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
