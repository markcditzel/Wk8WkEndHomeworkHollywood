import models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OwnerTest {
    Studio studio1;
    Studio studio2;
    Owner owner1;
    Person owner2;


    @Before
    public void before(){
        studio1 = new Studio("NBC", "Universal Pictures", 1912);

        owner1 = new Owner("Bob", 77, Gender.MALE, 55000,true, Temperament.CRAZY, studio1);
    }

//    @Test // ensure we can retrieve the studio objects stored within owner1
//    public void ownerhasStudio(){
//        assertEquals("Universal Pictures", owner1.getStudio().getStudioname());
//    }

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

//    @Test
//    public void ownerhasId(){
//        Studio studio2 = new Studio("Sony", "Columbia Pictures", 1981);
//        Person owner2 = new Owner("Mike", 55, Gender.OTHER, 100000, true, studio2);
//        owner2.setId(1);
//        assertEquals(1, owner2.getId());
//    }

}
