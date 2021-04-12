public class SmartBuilding {

    private SmartLightSwitch[] smartLights;
    private int currentIndex;
    
    public SmartBuilding(int size) {
        smartLights = new SmartLightSwitch[size];
        currentIndex = 0;
    }

    public int size(){ return smartLights.length; }

    public void add(double location, boolean value){
        if(currentIndex >= size()) { return;}
	    SmartLightSwitch object = new SmartLightSwitch(value, location);
        smartLights[currentIndex] = object;
        currentIndex++;
    }
    
    public String display(){
        String s = "";
        for(SmartLightSwitch object : smartLights){
            s+= object.toString() + " ";
        }
        return s;
    }

    public void updateObject(double location){
        for(SmartLightSwitch object : smartLights){      
            if(object.getLocation() == location) {
                object.setStatus(object.isStatus() == true ? false: true);
            }
        }
    }
}

