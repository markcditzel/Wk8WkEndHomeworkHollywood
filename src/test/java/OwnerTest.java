import models.Gender;
import models.Owner;
import models.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OwnerTest {
    Studio studio1;
    Owner owner1;


    @Before
    public void before(){
        studio1 = new Studio("NBC", "Universal Pictures", 1912);

        owner1 = new Owner("Bob", 77, Gender.MALE, 55000,true, studio1);
    }

    @Test // ensure we can retrieve the studio objects stored within owner1
    public void ownerhasStudio(){
        assertEquals("Universal Pictures", owner1.getStudio().getStudioname());
    }

    @Test
    public void ownerHasName() {
        assertEquals("Bob", owner1.getName());
    }

    @Test
    public void ownerHasAge() {
        assertEquals(77, owner1.getAge());
    }

    @Test
    public void ownerHasGender() {
        assertEquals("Male", owner1.getGender().getGendername() );
    }

    @Test
    public void ownerhasEmploymentStatus() {
        assertEquals(true, owner1.isEmploymentStatus());
    }
}