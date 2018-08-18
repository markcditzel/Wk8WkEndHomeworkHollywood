import db.DBHelper;
import db.HibernateUtil;
import models.Gender;
import models.Owner;
import models.Studio;
import models.Temperament;

public class Runner { // This is for testing the db

    public static void main(String[] args) {

        // (1) Create an Owner (without a Studio)

        Owner owner1 = new Owner("Mike", 55, Gender.MALE, 100000, true, Temperament.CRAZY);
        DBHelper.save(owner1);

        Owner owner2 = new Owner("John", 33, Gender.MALE, 155000, true, Temperament.PASSIVE);
        DBHelper.save(owner2);

        // Update Owner
        owner1.setAge(56);
        DBHelper.update(owner1);

        // Delete Owner
        DBHelper.delete(owner1);








        // (1) Create a Studio

//        Studio fox = new Studio("Sony", "Columbia Pictures", 1918);
//        DBHelper.save(fox);

//        Owner bob = new Owner("Bob McClure", 66, Gender.MALE, 500000,true, fox);
//        DBHelper.save(bob);

        HibernateUtil.getSessionFactory().close(); // This is a safety feature ensure postgresdb stability
    }
}



