import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void canFindAConferenceRoom(){
        ConferenceRoom foundConferenceRoom = hotel.findConferenceRoom("The Room Of Pedro");
        assertEquals(conferenceRoom, foundConferenceRoom);
    }

    @Test
    public void canGuestsCheckIntoABedroom(){
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(bob);
        hotel.checkInGuestsToBedroom(23, guests);
        assertEquals(1, singleBedroom.guestListSize());
    }

    @Test
    public void canGuestsCheckOutABedroom(){
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(bob);
        hotel.checkInGuestsToBedroom(23, guests);
        hotel.checkOutGuestsFromBedroom(23);
        assertEquals(0, singleBedroom.guestListSize());
    }

    @Test
    public void canGuestsCheckIntoAConferenceRoom(){
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(sandra);
        hotel.checkInGuestsToConferenceRoom("The Room Of Pedro", guests);
        assertEquals(1, conferenceRoom.guestListSize());
    }

    @Test
    public void canGuestsCheckOutAConferenceRoom(){
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(sandra);
        hotel.checkInGuestsToConferenceRoom("The Room Of Pedro", guests);
        assertEquals(1, conferenceRoom.guestListSize());
    }



}
