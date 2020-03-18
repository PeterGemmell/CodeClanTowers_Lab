import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceroom;
    private Guest bob;
    private Guest sandra;
    private Guest alex;

    @Before
    public void before(){
        conferenceroom = new ConferenceRoom(450, "The Lomond Suite");
        bob = new Guest("Bob");
        sandra = new Guest("Sandra");
        alex = new Guest("Alex");
    }

    @Test
    public void addNewGuestToConference(){
        conferenceroom.addConferenceGuest(sandra);
        assertEquals(1, conferenceroom.conferenceGuestCount());
    }

    @Test
    public void emptyConferenceRoom(){
        assertEquals(0, conferenceroom.conferenceGuestCount());
    }

    @Test
    public void conferenceRoomCapacity(){
        assertEquals(true, conferenceroom.conferenceRoomFull());
    }

}
