package models;

import java.util.ArrayList;
import java.util.List;

public abstract class FilmPersonnel extends Person {

    //IV:

    private List<Film> assignedFilms;

    public FilmPersonnel(String name, int age, Gender gender, double salary, boolean employmentStatus) {
        super(name, age, gender, salary, employmentStatus);
        this.assignedFilms = new ArrayList<Film>();
    }
}
