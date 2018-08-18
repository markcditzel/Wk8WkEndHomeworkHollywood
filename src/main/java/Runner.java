import db.DBHelper;
import db.HibernateUtil;
import models.Gender;
import models.Owner;
import models.Studio;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        // (1) Create an Owner

        Owner owner1 = new Owner("Bob Carolgees", 67, Gender.MALE, 100000,true, Studio.VIACOM);

        owner1.setAge(68);

        owner1.setStudio(Studio.FOX);

        owner1.setGender(Gender.OTHER);










        HibernateUtil.getSessionFactory().close(); // This is a safety feature ensure postgresdb stability
    }
}



