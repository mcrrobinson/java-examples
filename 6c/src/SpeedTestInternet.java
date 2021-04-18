
public class SpeedTestInternet {
   
    double[] speeds;

    public SpeedTestInternet(int days) {
        this.speeds = new double[days];
    }

    public int size() {
        return this.speeds.length;
    }

    public void set(int i, double nextInt) {
        this.speeds[i] = nextInt;
    }

    public double get(int index) {
        return this.speeds[index];
    }

    public double fastestSpeed() {
        double value = get(0);
        for(int i = 1; i < size();i++){
            if(value < get(i)){ 
                value = get(i); 
            }
        }
        return value;
    }

    public double slowestSpeed() {
        double value = get(0);
        for(int i = 1; i < size();i++){
            if(value > get(i)){ 
                value = get(i); 
            }
        }
        return value;
    }

    public double averageSpeed() {
        int value = 0;
        for(int i = 0; i < size();i++){
            value += get(i);
        }
        return value/size();
    }

    public String allSpeeds() {
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

    public void replaceSlowestSpeed(double slowestSpeed, double correct) {
        for (int i = 0; i < speeds.length; i++) {
            if(this.speeds[i]==slowestSpeed){
                set(i, correct);
            }
        }
    }
    
}
