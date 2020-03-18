import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guests =  new ArrayList<Guest>();
    }

    public void addConferenceGuest(Guest guest){
        this.guests.add(guest);
    }

    public int conferenceGuestCount(){
        return this.guests.size();
    }

    public boolean conferenceRoomFull(){
        if(this.guests.size() >= this.capacity){
            return false;
        }else{
            return true;
        }
    }
}
