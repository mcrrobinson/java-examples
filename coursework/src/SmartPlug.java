
public class SmartPlug {
    private int applianceID;
    private int plugID;
    private int roomID;
    private boolean status;

    public SmartPlug(int applianceID, int plugID, int roomID, boolean status) {
        this.applianceID = applianceID;
        this.plugID = plugID;
        this.roomID = roomID;
        this.status = status;
    }

    // applianceID connected to.
    public int getApplianceID(){
        return this.applianceID;
    }

    public void setApplianceID(int applianceID){
        this.applianceID = applianceID;
    }

    public int getPlugID(){
        return this.plugID;
    }

    public void setPlugID(int plugID){
        this.plugID = plugID;
    }

    // Room ID
    public int getRoomID(){
        return this.roomID;
    }

    public void setRoomID(int roomID){
        this.roomID = roomID;
    }

    // Status
    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
}
