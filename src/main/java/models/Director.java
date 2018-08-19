package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="directors")

public class Director extends Person {

   // IV:
    List<Film> films;

    //Constructor
    public Director(String name, int age, Gender gender, double salary, boolean employmentStatus) {
        super(name, age, gender, salary, employmentStatus);
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

    //Methods

    //Use this method to return the number of films associated with a director
     public int numberOfFilms(){
        return this.films.size();
    }
//
//    //How to add a Film to the directors List<Film>?
//    public void addFilmToDirectorsFilms(Film film){
//        this.films.add(film);
//    }



}
