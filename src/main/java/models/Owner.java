package models;

public class Owner extends Person{

    //IV
    private Studio studio;



    // Constructor
     public Owner(String name, int age, Gender gender, double salary, boolean employmentStatus, Studio studio) {
        super(name, age, gender, salary, employmentStatus);
        this.studio = studio;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }
}
