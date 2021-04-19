import java.util.ArrayList;
import java.util.List;

public class SmartBuilding {
    private int currentIndex = 0;
   
    // Fixed list.
    private SmartPlug[] smartPlugs;

    // Dynamic list.
    public List<String> smartRooms = new ArrayList<String>();

    public SmartBuilding(int size) {
        smartPlugs = new SmartPlug[size];
    }

    public int checkRoom(String room){
        for (int i = 0; i < smartRooms.size(); i++) {
            if(smartRooms.get(i).equals(room)){
                return i;
            }
        }
        smartRooms.add(room);
        return smartRooms.size()-1;
    }

    public void addSmartPlug(String appliance, String room, boolean status) {
        int roomID = checkRoom(room);
        if(currentIndex >= smartPlugs.length) { return;}
        SmartPlug object = new SmartPlug(appliance, roomID, status);
        smartPlugs[currentIndex] = object;
        currentIndex++;
    }

    public int sizeSmartPlug() {
        return this.smartPlugs.length;
    }

    public int sizeSmartRoom() {
        return this.smartRooms.size();
    }

    public void display(){
        String s = "";
        for (int i = 0; i < smartRooms.size(); i++)
        {
            System.out.printf("ROOM: %d\n", i);
            for(SmartPlug object : smartPlugs)
            {
                if(i==object.getRoomID())
                {
                    System.out.printf("\tSmartPlug | attached to: %s \t| Room: %s \t| Status %b\n", object.getAppliance(), smartRooms.get(object.getRoomID()), object.getStatus());
                }
                
            }
        }
    }

}
