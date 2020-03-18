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
}
