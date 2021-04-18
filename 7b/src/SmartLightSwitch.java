public class SmartLightSwitch {
    
    private boolean status;
    private double location;

    public SmartLightSwitch(boolean status, double location) {
        this.status = status;
        this.location = location;
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
        return "status: " + status +
                " | location: " + location +
                " |";
    }
}