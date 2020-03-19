import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        System.out.println("Greetings Traveller!!");
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public Bedroom findBedroom(int roomNumber){
        Bedroom foundRoom = null;
        for(Bedroom bedroom : this.bedrooms){
            if(bedroom.getRoomNumber() == roomNumber){
                foundRoom = bedroom;
            }
        }
        return foundRoom;
    }

    public ConferenceRoom findConferenceRoom(String roomName){
        ConferenceRoom foundConferenceRoom = null;
        for(ConferenceRoom conferenceRoom : this.conferenceRooms){
            if(conferenceRoom.getName() == roomName){
                foundConferenceRoom = conferenceRoom;
            }
        }
        return foundConferenceRoom;

    }

    public void checkInGuestsToBedroom(int roomNumber, ArrayList<Guest> guests){
        Bedroom bedroom = findBedroom(roomNumber);
        if(bedroom != null && bedroom.isVacant()){
            for(Guest guest: guests){
                bedroom.checkInGuest(guest);
            }
        }

    }

    public void checkOutGuestsFromBedroom(int roomNumber){
        Bedroom bedroom = findBedroom(roomNumber);
        if(bedroom != null){
            bedroom.checkOutGuests();
        }

    }

    public void checkInGuestsToConferenceRoom(String roomName, ArrayList<Guest> guests){
        ConferenceRoom conferenceRoom = findConferenceRoom(roomName);
        if(conferenceRoom != null){
            for(Guest guest: guests){
                conferenceRoom.checkInGuest(guest);
            }
        }

    }

    public void checkOutGuestsToConferenceRoom(String roomName){
        ConferenceRoom conferenceRoom = findConferenceRoom(roomName);
        if(conferenceRoom != null){
          conferenceRoom.checkOutGuests();
        }
    }
}
