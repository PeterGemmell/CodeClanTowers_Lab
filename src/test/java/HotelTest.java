import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom singleBedroom;
    Bedroom doubleBedroom;
    ConferenceRoom conferenceRoom;
    Guest bob;
    Guest sandra;
    Guest alex;

    @Before
    public void setUp(){
        hotel = new Hotel();
        singleBedroom = new Bedroom(23, 1, "single");
        doubleBedroom = new Bedroom(32, 2, "double");
        conferenceRoom = new ConferenceRoom(4, "The Room Of Pedro");
        bob = new Guest("Bob");
        sandra = new Guest("Sandra");
        alex = new Guest("Alex");
        hotel.addBedroom(singleBedroom);
        hotel.addBedroom(doubleBedroom);
        hotel.addConferenceRoom(conferenceRoom);

    }

    @Test
    public void canFindABedroom(){
        Bedroom foundRoom = hotel.findBedroom(23);
        assertEquals(singleBedroom, foundRoom);
    }

}
