import db.DBHelper;
import db.HibernateUtil;
import models.Gender;
import models.Owner;
import models.Studio;

public class Runner { // This is for testing the db

    public static void main(String[] args) {

        // (1) Create a Studio

//        Studio fox = new Studio("Sony", "Columbia Pictures", 1918);
//        DBHelper.save(fox);

//        Owner bob = new Owner("Bob McClure", 66, Gender.MALE, 500000,true, fox);
//        DBHelper.save(bob);

        HibernateUtil.getSessionFactory().close(); // This is a safety feature ensure postgresdb stability
    }
}



