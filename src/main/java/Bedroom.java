
import java.util.ArrayList;

public class Bedroom {
   private int roomNumber;
   private int capacity;
   private String type;
   private ArrayList<Guest> guests;

   public Bedroom(int roomNumber, int capacity, String type){
    this.roomNumber = roomNumber;
    this.capacity = capacity;
    this.type = type;
    this.guests = new ArrayList<Guest>();
   }

   public void addGuest(Guest guest){
       this.guests.add(guest);
   }

   public int guestCount(){
       return this.guests.size();
   }

   public boolean roomFull(){
       if(this.guests.size() >= this.capacity){
           return false;
       }else{
           return true;
       }
   }

    public int getRoomNumber() {
        return roomNumber;
    }
//
//    public void setRoomNumber(int roomnumber) {
//        this.roomNumber = roomnumber;
//    }
//
    public int getCapacity() {
        return capacity;
    }
//
//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public ArrayList<Guest> getGuest() {
//        return guest;
//    }
//
//    public void setGuest(ArrayList<Guest> guest) {
//        this.guest = guest;
//    }
}
