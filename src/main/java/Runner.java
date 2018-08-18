import db.HibernateUtil;
import models.Gender;
import models.Owner;
import models.StudioEnum;

public class Runner { // This is for testing the db

    public static void main(String[] args) {

        // (1) Create an Owner


        HibernateUtil.getSessionFactory().close(); // This is a safety feature ensure postgresdb stability
    }
}



