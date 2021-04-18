import java.util.Scanner;
public class Tasks {
    public static void main(String[] args) {
        int gradeCount = 4;

        //STEP 1 - create object
        lineBreak(); output("STEP 1 - create object");lineBreak();
        GradeManager gm = new GradeManager(gradeCount);
        Scanner input = new Scanner(System.in);
        
        //STEP 2 - populate
        lineBreak(); output("STEP 2 - populate ");lineBreak();
        for(int i = 0; i < gm.size();i++){
            output("Enter grade  " + (i + 1) + " of " + gradeCount + ": ");
            gm.set(i, input.nextDouble());
        }
        
        //STEP 3 - analyse and display
        lineBreak();output("STEP 3 - analyse and display");lineBreak();
        output("Lowest grade: " + gm.lowestGrade());
        output("Highest grade: " + gm.highestGrade());
        output("Average grade: " + gm.averageGrade());
        output("All grades: " + gm.allGgrades());
       
        //STEP 4 - update
        lineBreak();output("STEP 4 - update");lineBreak();
        output("Updating grade for" + gm.allGgrades() );
        output("Please enter index: ");
        int index = input.nextInt();  
        output("Please enter updated grade: ");
        double update = input.nextDouble();        
        gm.replaceGrade(index, update);

        //STEP 3 - analyse and display
        lineBreak();output("STEP 3 - analyse and display");lineBreak();
        output("Lowest grade: " + gm.lowestGrade());
        output("Highest grade: " + gm.highestGrade());
        output("Average grade: " + gm.averageGrade());
        output("All grades: " + gm.allGgrades());         
    }
    
    public static void output(String s){System.out.println(s); }
    public static void lineBreak(){ output("-------------------");  }     
}
