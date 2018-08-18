package models;

public class Studio {

    //IV
    private String parentCompany;
    private String studioname;
    private int datefounded;

    // Constructor
    public Studio(String parentCompany, String studioname, int datefounded) {
        this.parentCompany = parentCompany;
        this.studioname = studioname;
        this.datefounded = datefounded;
    }

    //Getters and Setters
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
}
