import db.DBHelper;
import db.HibernateUtil;

import java.util.List;

public class Runner {

    public static void main(String[] args) {



        HibernateUtil.getSessionFactory().close(); // This is a safety feature ensure postgresdb stability
    }
}



