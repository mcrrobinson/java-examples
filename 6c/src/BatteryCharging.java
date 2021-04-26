public class BatteryCharging {
    private double[] chargingTime;

    public BatteryCharging(int chargingCycles) {
        this.chargingTime = new double[chargingCycles];
    }

    public String listAllBatteryChargeTimes() {
        String values = "[ ";
        for(int i = 0; i < size();i++){
            if(i<size()-1){
                values += get(i) + " , ";
            }
            else {
                values += get(i) ;
            }
        } 
        values += " ]";
        return values;
    }

    public double shortestCharge() {
        double value = get(0);
        for(int i = 1; i < size();i++){
            if(value > get(i)){ 
                value = get(i); 
            }
        }
        return value;
    }

    public double longestCharge() {
        double value = get(0);
        for(int i = 1; i < size();i++){
            if(value < get(i)){ 
                value = get(i); 
            }
        }
        return value;
    }

    public void set(int i, double nextDouble) {
        this.chargingTime[i] = nextDouble;
    }

    public double size() {
        return this.chargingTime.length;
    }

    public void replace(int index, double value) {
        set(index, value);
    }

    public double get(int index){
        return this.chargingTime[index];
    }
    
}

