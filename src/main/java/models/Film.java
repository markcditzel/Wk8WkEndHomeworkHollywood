package models;

import javax.persistence.*;

public class Film {

    //IV:
    private String title;
    private Genre genre;
    private double budget;
    private double takings;
    private int ageRating;
    private Director director;

    //Constructor:

    public Film(String title, Genre genre, double budget, int ageRating, Director director) {
        this.title = title;
        this.genre = genre;
        this.budget = budget;
        this.ageRating = ageRating;
        this.director = director;
        this.takings = 0;
    }

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="genre")
    public Genre getGenre() {
        return genre;
    }

    @Enumerated(value = EnumType.STRING)
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Column(name="budget")
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Column(name="takings")
    public double getTakings() {
        return takings;
    }

    public void setTakings(double takings) {
        this.takings = takings;
    }

    @Column(name="ageRating")
    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

//    @ManyToOne
//    @JoinColumn(name="director_id", nullable = false) // film must have director
    @Column(name="director")
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
