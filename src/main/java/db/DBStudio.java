package db;

import models.Director;
import models.Studio;

public class DBStudio {

    public static void addStudioToDirector(Studio studio, Director director){
        studio.addDirectorToStudio(director);
        DBHelper.update(studio);
    }

}
