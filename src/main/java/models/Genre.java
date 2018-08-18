package models;

public enum Genre {

    HORROR("Horror"),
    ROMANCE("Romance"),
    SCIFI("Sci-Fi"),
    PERIOD("Period Drama");

    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
