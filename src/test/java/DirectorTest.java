import models.Director;
import models.Film;
import models.Gender;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static models.Genre.HORROR;
import static models.Genre.SCIFI;
import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director1;
    Film film1;
    Film film2;

    @Before
    public void before() {
        director1 = new Director("Tim", 22, Gender.MALE, 155000, true);
        film1 = new Film("Jaws", HORROR, 100, 18, director1);
        film2 = new Film("ET", SCIFI, 200, 12, director1);
    }

    @Test
    public void directorHasName() {
        assertEquals("Tim", director1.getName());
    }

    @Test
    public void directorHasCountOfFilms1() {
        ArrayList<Film> filmlist = new ArrayList<Film>();
        filmlist.add(film1);
        director1.setFilms(filmlist);
        assertEquals(1, director1.getFilms().size());
    }

    @Test
    public void directorHasCountOfFilms2() {
        ArrayList<Film> filmlist = new ArrayList<Film>();
        filmlist.add(film1);
        director1.setFilms(filmlist);
        assertEquals(1, director1.numberOfFilms());
    }

//    @Test - how to add a film into a pre-existing arraylist????
//    public void canAddFilmIntoPrexistingArrayListFilms(){
//        director1.addFilmToDirectorsFilms(film2);
//        assertEquals(2, director1.numberOfFilms());
//         }

    @Test
    public void doesDirectorHaveSalary(){
        assertEquals(155000, director1.getSalary(),0);
    }




}
