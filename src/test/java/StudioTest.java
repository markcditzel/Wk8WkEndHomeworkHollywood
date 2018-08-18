import models.Gender;
import models.Owner;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudioTest {
// setup empty Class-defined variables
    Studio studio1;
    Owner owner1;


    @Before
    public void before(){
        studio1 = new Studio("NBC", "Universal Pictures", 1912);

        owner1 = new Owner("Bob", 77, Gender.MALE, 55000,true, studio1);
    }


    //This test is not possible as Studio does not store an owner
//    @Test
//    public void studioHasOwner(){
//        assertEquals(0,0);
//    }

    @Test
    public void studioHasParentCompany(){
        assertEquals("NBC", studio1.getParentCompany());
    }

    @Test
    public void studioHasStudioName() {
        assertEquals("Universal Pictures", studio1.getStudioname());
    }

    @Test
    public void studioHasDateFounded(){
        assertEquals(1912, studio1.getDatefounded());
    }

    @Test
    public void studioHasId(){
        studio1.setId(2);
        assertEquals(2, studio1.getId());
    }
}
