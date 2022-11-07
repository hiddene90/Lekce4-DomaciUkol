import java.math.BigDecimal;

public class Room {
    int roomNum;
    int numOfBeds;
    boolean balcony;
    boolean seaView;
    BigDecimal pricePerNight;

    public Room(int roomNum, int numOfBeds, boolean balcony, boolean seaView, BigDecimal pricePerNight) {
        this.roomNum = roomNum;
        this.numOfBeds = numOfBeds;
        this.balcony = balcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }

    public Room(int roomNum, Room room) {
        this(
                roomNum,
                room.numOfBeds,
                room.balcony,
                room.seaView,
                room.pricePerNight
        );
    }

    ///region
    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    ///endregion
    public String getDescription() {
        String description = "Pokoj číslo: " + roomNum + "\nPočet postelí: " + numOfBeds + "\nCena za noc: " + pricePerNight+"\n";
        if (seaView && balcony) {
            description += "Výhled na moře: Ano\nBalkón: Ano";
        } else if (!seaView && balcony){
            description += "Výhled na moře: Ne\nBalkón: Ano";
        }else if(seaView  &&!balcony){
            description +="Výhled na moře: Ano\nBalkón: Ne";
        }else {
            description += "Výhled na moře: Ne\nBalkón: Ne";
        }
       return description;
    }
}
