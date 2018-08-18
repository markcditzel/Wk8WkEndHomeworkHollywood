import models.*;
import org.junit.Before;
import org.junit.Test;

import static models.Genre.HORROR;
import static org.junit.Assert.assertEquals;

public class FilmTest {

    Director director1;
    Film film1;


    @Before
    public void before() {
        director1 = new Director("Tim", 22, Gender.MALE, 155000, true);
        film1 = new Film("Jaws", HORROR, 100, 18, director1);
    }

    @Test
    public void filmHasTitle(){
        assertEquals("Jaws", film1.getTitle());
    }

    @Test
    public void filmHasGenre(){
        assertEquals("Horror", film1.getGenre().getGenre());
    }

    @Test
    public void filmHasBudget(){
        assertEquals(100, film1.getBudget(),0);
    }

    @Test
    public void filmHasAgeRating(){
        assertEquals(18, film1.getAgeRating());
    }

    @Test
    public void filmHasDirector(){
        assertEquals("Tim", film1.getDirector().getName());
    }


}
