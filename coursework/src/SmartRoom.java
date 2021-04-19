public class SmartRoom {
    private String room;
    private int ID;

    public SmartRoom(String room, int ID) {
        this.room = room;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

}
