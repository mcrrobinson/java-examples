public class SmartBuilding {

    private SmartPlug[] smartPlug;
    private SmartRoom[] smartRooms;
    
    private int currentIndex;
    
    public SmartBuilding(int size) {
        smartPlug = new SmartPlug[size];
        currentIndex = 0;
    }

    public int size(){ return smartPlug.length; }

    public void add(String room, boolean value){
        if(currentIndex >= size()) { return;}
	    SmartPlug object = new SmartPlug(value, room, currentIndex);
        smartPlug[currentIndex] = object;
        currentIndex++;
    }
    
    public String display(){
        String s = "";
        for(SmartPlug object : smartPlug){
            s+= object.toString() + " ";
        }
        return s;
    }

    public void updateObject(String room){
        for(SmartPlug object : smartPlug){      
            if(object.getRoom().equals(room)) {
                object.setStatus(object.isStatus() == true ? false: true);
            }
        }
    }

    public String listRooms(){
        String s = "";
        for(SmartPlug object : smartPlug){
            s += object.getRoom() + "\n";
        }
        return s;
    }

    public void toggle(String room){
        for(SmartPlug object : smartPlug){
            if(object.getRoom().equals(room)){
                object.toggle();
                return;
            }
        }
        System.out.println("Enter a valid room");
    }
    
    public void changeRoom(int lightID, String newRoom){
        for(SmartPlug object : smartPlug){
            if(object.getID() == lightID){
                object.setRoom(newRoom);
            }
        }
    }    
}

