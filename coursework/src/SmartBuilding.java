import java.util.ArrayList;
import java.util.Arrays;

public class SmartBuilding {
    private int smartPlugIndex = 0;
    private int smartRoomIndex = 0;

    private ArrayList<SmartPlug> smartPlugs;
    private ArrayList<SmartRoom> smartRooms;
    private ArrayList<String> smartAppliances;

    public SmartBuilding(int plugs, int rooms) {
        this.smartPlugs = new ArrayList<SmartPlug>(Arrays.asList(new SmartPlug[plugs]));
        this.smartRooms = new ArrayList<SmartRoom>(Arrays.asList(new SmartRoom[rooms]));
        this.smartAppliances = new ArrayList<String>(Arrays.asList("Lamp", "TV", "Computer", "Phone Charger", "Heater"));
    }

    public void addSmartRoom(String room, boolean extension) {
        SmartRoom object = new SmartRoom(room, this.smartRoomIndex);

        // If you're setting defined number of rooms, use set, if you're
        // extending more more plugs use add.
        if(!extension) smartRooms.set(this.smartRoomIndex, object);
        else smartRooms.add(object);

        this.smartRoomIndex++;
    }

    public void addSmartPlug(int applianceID, int roomID, boolean status, boolean extension) {
        SmartPlug object = new SmartPlug(applianceID, this.smartPlugIndex, roomID, status);
        
        // If you're setting defined number of plugs, use set, if you're
        // extending more more plugs use add.
        if(!extension) smartPlugs.set(this.smartPlugIndex, object);
        else smartPlugs.add(object);
        
        this.smartPlugIndex++;
    }

    public int sizeSmartPlug() {
        return this.smartPlugs.size();
    }

    public int sizeSmartRoom() {
        return this.smartRooms.size();
    }

    public int sizeSmartAppliance() {
        return this.smartAppliances.size();
    }

    public String displaySmartRooms() {
        String s = "";
        for (int i = 0; i < sizeSmartRoom(); i++) {
            s += "\t[" + i + "]\t" + smartRooms.get(i).getRoomName() + "\n";
        }
        return s;
    }

    public String displaySmartAppliances() {
        String s = "";
        for (int i = 0; i < smartAppliances.size(); i++) {
            s += "\t[" + i + "]\t" + smartAppliances.get(i) + "\n";
        }
        return s;
    }

    public String displaySmartPlugs() {
        String s = "";
        for (int i = 0; i < sizeSmartPlug(); i++) {
            s += "\t[ " + i + " ]\tSmartPlug | attached to: " + smartAppliances.get(smartPlugs.get(i).getApplianceID()) + "\t| Room: "
                    + smartRooms.get(smartPlugs.get(i).getRoomID()).getRoomName() + "\t| Status: "
                    + (smartPlugs.get(i).getStatus() == false ? "Off" : "On") + "\n";
        }
        return s;
    }

    public String displaySmartPlugs(int roomID) {
        String s = "";
        for (int i = 0; i < sizeSmartPlug(); i++) {
            if (smartPlugs.get(i).getRoomID() == roomID)
                s += "\t[ " + i + " ]\tSmartPlug | attached to: "
                        + smartAppliances.get(smartPlugs.get(i).getApplianceID()) + "\t| Room: "
                        + smartRooms.get(smartPlugs.get(i).getRoomID()).getRoomName() + "\t| Status: "
                        + (smartPlugs.get(i).getStatus() == false ? "Off" : "On") + "\n";
        }
        return s;
    }

    public String displayAll() {
        String s = "";
        for (int i = 0; i < sizeSmartRoom(); i++) {
            s += "ROOM: " + i + "\n";
            for (SmartPlug object : smartPlugs) {
                if (i == object.getRoomID()) {
                    s += "\tSmartPlug | attached to: " + smartAppliances.get(object.getApplianceID()) + "\t| Room: "
                            + smartRooms.get(object.getRoomID()).getRoomName() + "\t| Status: "
                            + (object.getStatus() == false ? "Off" : "On") + "\n";
                }

            }
        }
        return s;
    }

    public void enableAllRoomPlugs(int roomID) {
        for (SmartPlug smartPlug : smartPlugs) {
            if(smartPlug.getRoomID()==roomID) smartPlug.setStatus(true);
        }
    }

    public void disableAllRoomPlugs(int roomID) {
        for (SmartPlug smartPlug : smartPlugs) {
            if(smartPlug.getRoomID()==roomID) smartPlug.setStatus(false);
        }
    }

    public void enableAllPlugs() {
        for (SmartPlug smartPlug : smartPlugs) {
            smartPlug.setStatus(true);
        }
    }

    public void disableAllPlugs() {
        for (SmartPlug smartPlug : smartPlugs) {
            smartPlug.setStatus(false);
        }
    }

    public void togglePlug(int plug) {
        for (SmartPlug smartPlug : smartPlugs) {
            if (smartPlug.getPlugID() == plug) smartPlug.setStatus(smartPlug.getStatus() == false ? true : false);
        }
    }

    public void enablePlug(int plug) {
        for (SmartPlug smartPlug : smartPlugs) {
            if (smartPlug.getPlugID() == plug) smartPlug.setStatus(true);
        }
    }

    public void disablePlug(int plug) {
        for (SmartPlug smartPlug : smartPlugs) {
            if (smartPlug.getPlugID() == plug) smartPlug.setStatus(false);
        }
    }

    public void changePlugAppliance(int plug, int applianceID) {
        for (SmartPlug smartPlug : smartPlugs) {
            if (smartPlug.getPlugID() == plug) smartPlug.setApplianceID(applianceID);
        }
    }

    public void changePlugRoom(int plug, int roomID) {
        for (SmartPlug smartPlug : smartPlugs) {
            if (smartPlug.getPlugID() == plug) smartPlug.setRoomID(roomID);
        }
    }

    public void addSmartAppliance(String name) {
        smartAppliances.add(name);
    }
}
