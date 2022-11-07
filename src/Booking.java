import java.time.LocalDate;
import java.util.List;

public class Booking {
    Room room;
    Guest guest;
    List<Guest> otherGuests;
    LocalDate bookedFrom;
    LocalDate bookedTill;
    String typeOfVacation;

    public Booking(Room room, Guest guest, LocalDate bookedFrom, LocalDate bookedTill, String typeOfVacation) {
        this.room = room;
        this.guest = guest;
        this.bookedFrom = bookedFrom;
        this.bookedTill = bookedTill;
        this.typeOfVacation = typeOfVacation;
    }
    public Booking(Room room, List<Guest> otherGuests,LocalDate bookedFrom, LocalDate bookedTill, String typeOfVacation){
        this.room = room;
        this.guest = guest;
        this.bookedFrom = bookedFrom;
        this.bookedTill = bookedTill;
        this.typeOfVacation = typeOfVacation;
        this.otherGuests = otherGuests;
    }
    ///region
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDate getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(LocalDate bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public LocalDate getBookedTill() {
        return bookedTill;
    }

    public void setBookedTill(LocalDate bookedTill) {
        this.bookedTill = bookedTill;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }
    ///endregion

    public String getDescription() {
        String description = "Rezervace pokoje číslo: " + getRoom().getRoomNum()+"\n";
        if (this.guest != null) {
            description += "Host: " + guest.firstName + " " + guest.lastname + "\nOd: " + bookedFrom.getDayOfMonth()+"."+bookedFrom.getMonthValue()+"."+ bookedFrom.getYear() + "\nDo: " + bookedTill.getDayOfMonth()+"."+ bookedTill.getMonthValue()+"."+bookedTill.getYear();
        }else {
            description += "Hosté: ";
            for (Guest guestInList : otherGuests) {
                description += guestInList.firstName +" "+ guestInList.lastname +" ";
            }
            description +="\nOd: " + bookedFrom.getDayOfMonth()+"."+bookedFrom.getMonthValue()+"."+ bookedFrom.getYear() + "\nDo: " + bookedTill.getDayOfMonth()+"."+ bookedTill.getMonthValue()+"."+bookedTill.getYear();
        }
        return description;
    }
}


