import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest bob;
    private Guest sandra;
    private Guest alex;


    @Before
    public void before(){
        bedroom = new Bedroom(237, 2, "double");
        bob = new Guest("Bob");
        sandra = new Guest("Sandra");
        alex = new Guest("Alex");
    }

    @Test
    public void addNewGuest(){
        bedroom.addGuest(bob);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void emptyRoom(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void capacity(){
        assertEquals(true, bedroom.roomFull());
    }
}
