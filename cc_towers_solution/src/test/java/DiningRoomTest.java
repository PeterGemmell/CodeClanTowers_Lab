import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void setUp() {
        diningRoom = new DiningRoom(2, "Family Dining");
        guest1 = new Guest("Alex");
        guest2 = new Guest("Katie");
        guest3 = new Guest("Hannah");
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, diningRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Family Dining", diningRoom.getName());
    }

    @Test
    public void guestListSizeStartsAt0() {
        assertEquals(0, diningRoom.guestListSize());
    }

    @Test
    public void canCheckInGuest_underCapacity() {
        diningRoom.checkInGuest(guest1);
        assertEquals(1, diningRoom.guestListSize());
    }

    @Test
    public void canCheckInGuest_atCapacity() {
        diningRoom.checkInGuest(guest1);
        diningRoom.checkInGuest(guest2);
        assertEquals(2, diningRoom.guestListSize());
    }

    @Test
    public void cantCheckInGuest_overCapacity() {
        diningRoom.checkInGuest(guest1);
        diningRoom.checkInGuest(guest2);
        diningRoom.checkInGuest(guest3);
        assertEquals(2, diningRoom.guestListSize());
    }

    @Test
    public void canCheckOutGuests() {
        diningRoom.checkInGuest(guest1);
        diningRoom.checkInGuest(guest2);
        diningRoom.checkOutGuests();
        assertEquals(0, diningRoom.guestListSize());
    }
}
