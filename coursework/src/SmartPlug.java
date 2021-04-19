
public class SmartPlug {
    private String appliance;
    private int roomID;
    private boolean status;

    public SmartPlug(String appliance, int roomID, boolean status) {
        this.appliance = appliance;
        this.roomID = roomID;
        this.status = status;
    }

    // Appliance connected to.
    public String getAppliance(){
        return this.appliance;
    }

    public void setAppliance(String appliance){
        this.appliance = appliance;
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
