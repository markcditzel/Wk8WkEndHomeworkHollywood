package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="directors")

public class Director extends Person {

   // IV:
    List<Film> films;
    List<Studio> studios;

    //Constructor
    public Director(String name, int age, Gender gender, double salary, boolean employmentStatus) {
        super(name, age, gender, salary, employmentStatus);
        this.studios = new ArrayList<Studio>();
    }

    //Getters and Setters

    @OneToMany(mappedBy="director") // mapped in other class
    @Column(name="films")
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    // I Dont think CASCADE is needed on both of the Classes???
    @ManyToMany
   @JoinTable(name="studio_director",
           joinColumns = {@JoinColumn(name="director_id", nullable = false, updatable = false)},
           inverseJoinColumns = {@JoinColumn(name="studio_id", nullable = false, updatable = false)}
   )
    public List<Studio> getStudios() {
        return studios;
    }

    public void setStudios(List<Studio> studios) {
        this.studios = studios;
    }

    //Methods

    //Use this method to return the number of films associated with a director
     public int numberOfFilms(){
        return this.films.size();
    }

    public void addStudioToDirector(Studio studio){
        this.studios.add(studio);
    }
//
//    //How to add a Film to the directors List<Film>?
//    public void addFilmToDirectorsFilms(Film film){
//        this.films.add(film);
//    }



}
