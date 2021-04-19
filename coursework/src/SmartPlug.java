public class SmartPlug {
    
    private boolean status;
    private String room;
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public SmartPlug(boolean status, String room, int ID) {
        this.status = status;
        this.room = room;
        this.ID = ID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "\tstatus: " + status + "\t| room: " + room + "\t| ID: " + ID + "\n";
    }

    public void toggle(){
        setStatus(!isStatus());
    }
}