import db.DBHelper;
import db.DBStudio;
import db.HibernateUtil;
import models.*;

public class Runner { // This is for testing the db

    public static void main(String[] args) {

        // (0) Create a Studio

        Studio fox = new Studio("fox", "Columbia Pictures", 1918);
       DBHelper.save(fox);

        Studio sony = new Studio("Sony Corp", "Columbia Pictures", 1923);
        DBHelper.save(sony);

        Studio disney = new Studio("Walt Disney Corp", "Walt Disney Pictures", 1936);
        DBHelper.save(disney);


        // (1) Create an Owner (with a Studio)

        Owner owner1 = new Owner("Mike", 55, Gender.MALE, 100000, true, Temperament.CRAZY, fox);
        DBHelper.save(owner1);

        Owner owner2 = new Owner("John", 33, Gender.MALE, 155000, true, Temperament.PASSIVE, sony);
        DBHelper.save(owner2);

        Owner owner3 = new Owner("Jill", 33, Gender.FEMALE,250000, true, Temperament.PASSIVE, disney);
        DBHelper.save(owner3);

        // (2) Create Directors - as they are needed to creates Films

        Director stanleyKubrick = new Director("Stanley Kubrick", 78, Gender.MALE, 440000, true);
        DBHelper.save(stanleyKubrick);

        Director milosForman = new Director("Milos Forman", 66, Gender.MALE, 10000, true);
        DBHelper.save(milosForman);

        // (3) Create Films

        Film twelveAngryMen = new Film("12 Angry Men", Genre.PERIOD, 5000000, 5, milosForman);
        DBHelper.save(twelveAngryMen);

        Film twoThousAndOne = new Film("2001: A Space Odyssey", Genre.SCIFI, 3330000, 12, stanleyKubrick);
        DBHelper.save(twoThousAndOne);

     DBStudio.addStudioToDirector(fox, stanleyKubrick);

     DBStudio.addStudioToDirector(fox,milosForman);


// ************************* DON'T CODE UNDER THIS LINE ****************************************************

        HibernateUtil.getSessionFactory().close(); // This is a safety feature ensure postgresdb stability
    }
}



