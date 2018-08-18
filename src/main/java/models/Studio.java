package models;

public enum Studio {

    //Define the ENUM istelf and any of its associated FIELDS

   NB("Universal Pictures", 1912),
    VIACOM("Paramount Pictures", 1912),
    SONY("Columbia Pictures", 1918),
    WARNER("Warner Bros Pictures", 1923),
    WALTDISNEY("Walt Disney Pictures", 1923),
    FOX("20th Century Fox", 1935);

   //Define the IV for the field
    private final String filmStudio;
    private final int dateFounded;

    // Define a constructor to fields
    Studio(String filmStudio, int dateFounded){
        this.filmStudio = filmStudio;
        this.dateFounded = dateFounded;
    };

    //Define getters


    public String getFilmStudio() {
        return filmStudio;
    }

    public int getDateFounded() {
        return dateFounded;
    }
}
