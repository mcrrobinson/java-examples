public class SmartLightSwitch {
    
    private boolean status;
    private double location;
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public SmartLightSwitch(boolean status, double location, int ID) {
        this.status = status;
        this.location = location;
        this.ID = ID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "status: " + status + " | location: " + location + " | ID: " + ID + "\n";
    }

    public void toggle(){
        setStatus(!isStatus());
    }
}