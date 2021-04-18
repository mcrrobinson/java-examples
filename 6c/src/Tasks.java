import java.util.Scanner;
public class Tasks {
    public static void main(String[] args) {
        int days = 4;
        Scanner input = new Scanner(System.in);

        //STEP 1 - create object
        lineBreak(); output("STEP 1 - create object");lineBreak();
        SpeedTestInternet ist = new SpeedTestInternet(days);
      
        //STEP 2 - populate
        lineBreak(); output("STEP 2 - populate ");lineBreak();
        for(int i = 0; i < ist.size();i++){
            output("Enter Internet Speed for day " + (i + 1) + " of " + days + ": ");
            ist.set(i, input.nextDouble());
        }
  
        //STEP 3 - analyse and display
        lineBreak();output("STEP 3 - analyse and display");lineBreak();
        output("Slowest speed: " + ist.slowestSpeed());
        output("Fastest speed: " + ist.fastestSpeed());
        output("Average speed: " + ist.averageSpeed());
        output("All speeds: " + ist.allSpeeds());
               
        //STEP 4 - update       
        lineBreak();output("STEP 4 - update");lineBreak();
        output("Updating slowest speed...");
        output("Please enter updated speed: ");
        double correct = input.nextDouble();        
        ist.replaceSlowestSpeed(ist.slowestSpeed(), correct);
        
        //STEP 3 - analyse and display
        lineBreak();output("STEP 3 - analyse and display");lineBreak();
        output("Slowest speed: " + ist.slowestSpeed());
        output("Fastest speed: " + ist.fastestSpeed());
        output("Average speed: " + ist.averageSpeed());
        output("All speeds: " + ist.allSpeeds());        
    }
    
    public static void output(String s){System.out.println(s); }
    public static void lineBreak(){ output("-------------------");  }    
}
