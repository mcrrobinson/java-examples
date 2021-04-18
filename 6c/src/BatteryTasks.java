
import java.util.Scanner;

public class BatteryTasks {
    public static void main(String[] args) {
        int chargingCycles = 6;
        Scanner input = new Scanner(System.in);

        //STEP 1 - create object
        lineBreak(); output("STEP 1 - create object");lineBreak();
        BatteryCharging bc = new BatteryCharging(chargingCycles);       

        //STEP 2 - populate 
        lineBreak(); output("STEP 2 - populate ");lineBreak();
        for(int i = 0; i < bc.size();i++){
            output("Enter battery charging time (" + (i + 1) + " of " + chargingCycles + "): ");
            bc.set(i, input.nextDouble());
        }
        
        //STEP 3 - analyse and display
        lineBreak();output("STEP 3 - analyse and display");lineBreak();
        output("Battery charging times: \n" + bc.listAllBatteryChargeTimes());
        output("Smallest time to charge: " + bc.shortestCharge());
        output("Largest time to charge: " + bc.longestCharge());

        //STEP 4 - update
        lineBreak();output("STEP 4 - update");lineBreak();        
        output("***Updating values***");
        output("Enter an index value: ");
        int index = input.nextInt();
        output("Enter a new charging time: ");
        double value = input.nextDouble();
        bc.replace(index, value);

        //STEP 3 - analyse and display
        lineBreak();output("STEP 3 - analyse and display");lineBreak();
        output("Battery charging times: \n" + bc.listAllBatteryChargeTimes());
        output("Smallest time to charge: " + bc.shortestCharge());
        output("Largest time to charge: " + bc.longestCharge());
    }
    
    public static void output(String s){System.out.println(s); }
    public static void lineBreak(){ output("-------------------");  }   
}
