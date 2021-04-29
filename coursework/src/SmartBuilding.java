public class SmartBuilding {
    private int smartPlugIndex = 0;
    private int smartRoomIndex = 0;
    private int smartApplianceIndex = 5;

    private SmartPlug smartPlugs[];
    private SmartRoom smartRooms[];
    private String[] smartAppliances = {"Lamp", "TV", "Computer", "Phone Charger", "Heater"};

    public SmartBuilding(int plugs, int rooms) {
        this.smartPlugs = new SmartPlug[plugs];
        this.smartRooms = new SmartRoom[rooms];
    }

    public void addSmartRoom(String room) {
        if(this.smartRoomIndex >= sizeSmartRoom()) return;
        SmartRoom object = new SmartRoom(room, this.smartRoomIndex);

        // If you're setting defined number of rooms, use set, if you're
        // extending more more plugs use add.
        smartRooms[this.smartRoomIndex] = object;
        this.smartRoomIndex++;
    }

    public void addSmartPlug(int applianceID, int roomID, boolean status) {
        if(this.smartPlugIndex >= sizeSmartPlug()) return;
        SmartPlug object = new SmartPlug(applianceID, this.smartPlugIndex, roomID, status);
        
        // If you're setting defined number of plugs, use set, if you're
        // extending more more plugs use add.
        smartPlugs[this.smartPlugIndex] = object;       
        this.smartPlugIndex++;
    }

    public void addSmartAppliance(String name) {
        if(this.smartApplianceIndex >= sizeSmartAppliance()) return;
        smartAppliances[this.smartApplianceIndex] = name;       
        this.smartApplianceIndex++;
    }

    public int sizeSmartPlug() {
        return this.smartPlugs.length;
    }

    public int sizeSmartRoom() {
        return this.smartRooms.length;
    }

    public int sizeSmartAppliance() {
        return this.smartAppliances.length;
    }

    public void addNewSmartAppliances(int appliances) {
        String[] newArr = new String[sizeSmartAppliance() + appliances];
        for (int i = 0; i < sizeSmartAppliance(); i++) {
            System.out.println(this.smartAppliances[i]);
            newArr[i] = this.smartAppliances[i];
        }
        this.smartAppliances = newArr;
    }

    public void addNewSmartRooms(int rooms) {
        SmartRoom[] newArr = new SmartRoom[sizeSmartRoom() + rooms];
        for (int i = 0; i < sizeSmartRoom(); i++) {
            newArr[i] = this.smartRooms[i];
        }
        this.smartRooms = newArr;
    }

    public void addNewSmartPlugs(int plugs) {
        SmartPlug[] newArr = new SmartPlug[sizeSmartPlug() + plugs];
        for (int i = 0; i < sizeSmartPlug(); i++) {
            newArr[i] = this.smartPlugs[i];
        }
        this.smartPlugs = newArr;
    }

    public String displaySmartRooms() {
        String s = "";
        for (int i = 0; i < sizeSmartRoom(); i++) {
            s += "\t[" + i + "]\t" + smartRooms[i].getRoomName() + "\n";
        }
        return s;
    }

    public String displaySmartAppliances() {
        String s = "";
        for (int i = 0; i < sizeSmartAppliance(); i++) {
            s += "\t[" + i + "]\t" + smartAppliances[i] + "\n";
        }
        return s;
    }

    public String displaySmartPlugs() {
        String s = "";
        for (int i = 0; i < sizeSmartPlug(); i++) {
            s += "\t[ " + i + " ]\tSmartPlug | attached to: " + smartAppliances[smartPlugs[i].getApplianceID()] + "\t| Room: "
                    + smartRooms[smartPlugs[i].getRoomID()].getRoomName() + "\t| Status: "
                    + (smartPlugs[i].getStatus() == false ? "Off" : "On") + "\n";
        }
        return s;
    }

    public String displaySmartPlugs(int roomID) {
        String s = "";
        for (int i = 0; i < sizeSmartPlug(); i++) {
            if (smartPlugs[i].getRoomID() == roomID)
                s += "\t[ " + i + " ]\tSmartPlug | attached to: "
                        + smartAppliances[smartPlugs[i].getApplianceID()] + "\t| Room: "
                        + smartRooms[smartPlugs[i].getRoomID()].getRoomName() + "\t| Status: "
                        + (smartPlugs[i].getStatus() == false ? "Off" : "On") + "\n";
        }
        return s;
    }

    public String displayAll() {
        String s = "";
        for (int i = 0; i < sizeSmartRoom(); i++) {
            s += "ROOM: " + i + "\n";
            for (SmartPlug object : smartPlugs) {
                if (i == object.getRoomID()) {
                    s += "\tSmartPlug | attached to: " + smartAppliances[object.getApplianceID()] + "\t| Room: "
                            + smartRooms[object.getRoomID()].getRoomName() + "\t| Status: "
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
}
