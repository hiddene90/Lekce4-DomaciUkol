import java.util.ArrayList;

public class ListOfBookings {

    public ArrayList<Booking> list = new ArrayList<>();

    public ListOfBookings() {

    }
    public void addToList(Booking booking){
        list.add(booking);
    }
    public void removeFromList(Booking booking){
        list.remove(booking);
    }



}