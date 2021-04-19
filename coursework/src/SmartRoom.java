
public class SmartRoom {
    private String roomName;
    private int roomID;

    public SmartRoom(String room, int smartRoomIndex) {
        this.roomName = room;
        this.roomID = smartRoomIndex;
    }

    public String getRoomName(){
        return this.roomName;
    }

    public int getRoomID(){
        return this.roomID;
    }
}