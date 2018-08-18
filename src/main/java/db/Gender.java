package db;

public enum Gender {

    // Define the ENUM ITSELF and their associated FIELDS

    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    // Define the IV for the field
    private final String gendername;

    // Define a constructor to accept the field
    Gender(String gendername){
        this.gendername = gendername;
    }

    // Define a getter
    public String getGendername() {
        return gendername;
    }
}
