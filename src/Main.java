import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        //Vytvoření hostů
        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993,3,13) );
        Guest guest2 = new Guest("Jan","Dvořáček",LocalDate.of(1995,5,5));

        //Výpis popisu hostů
        System.out.println(guest1.getDescription());
        System.out.println("------------");
        System.out.println(guest2.getDescription());
        System.out.println("++++++++++++\n");

        //Vytvoření pokojů
        Room room1 = new Room(1,1,true,true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2,room1);
        Room room3 = new Room(3,3,false,true,BigDecimal.valueOf(2400));

        //Výpis popisu pokojů
        System.out.println(room1.getDescription());
        System.out.println("------------");
        System.out.println(room2.getDescription());
        System.out.println("------------");
        System.out.println(room3.getDescription());
        System.out.println("++++++++++++\n");

        //Vytvoření rezervací
        Booking booking1 = new Booking(room1,guest1,LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),"rekreační");
        List<Guest> guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);
        Booking booking2 = new Booking(room3,guestList,LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),"rekreační");
        //Výpis popisu rezervace
        System.out.println(booking1.getDescription());
        System.out.println("------------");
        System.out.println(booking2.getDescription());
        System.out.println("++++++++++++\n");

        //Vytvoření seznamu rezervací a přidání rezervací do seznamu
        ListOfBookings listOfBookings = new ListOfBookings();
        listOfBookings.addToList(booking1);
        listOfBookings.addToList(booking2);

        //Výpis celkového počtu rezervací
       System.out.println("Celkový počet rezervací: "+listOfBookings.list.size());


        }
    }

