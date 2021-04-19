import java.util.Scanner;

public class ConsoleEvents {

    public String getString(String prompt){
        Scanner in = new Scanner(System.in);
        String s;
        out(prompt);
        try {
            s = in.next();
        } catch (Exception e){
            return getString(prompt);
        }
        return s;
    }

    public void out(String message){ System.out.println(message);}
    public void out(int message){ System.out.println(message);}

    public int getInt(String prompt){
        Scanner in = new Scanner(System.in);
        int i;
        out(prompt);
        try {
            i = in.nextInt();
        } catch (Exception e){
           //extra messages 
           return getInt(prompt);
        }
        return i;
    }

    public double getDouble(String string){
        Scanner in = new Scanner(System.in);
        double i;
        out(string);
        try {
            i = in.nextDouble();
        } catch (Exception e){
           //extra messages 
           return getDouble(string);
        }
        return i;
    }

    public boolean getBoolean(String string) {
        Scanner in = new Scanner(System.in);
        int i;
        out(string);
        try {
            switch (in.nextInt()) {
                case 0:
                    return false;
                case 1:
                    return true;
                default:
                    return getBoolean(string);
            }
        } catch (Exception e){
           //extra messages 
           return getBoolean(string);
        }
    }

    public void menuOptions(SmartBuilding factory) {
        out("MENU OPTIONS");
        out("please select option:");
        out("1 - toggle lights in a location");
        out("2 - move light switch to another location");
    
        int optionLevel = getInt("");
    
        switch (optionLevel) {
            case 1:
                out(factory.display());
                factory.toggle(getDouble("Enter the location you wish to toggle"));
                break;
            case 2:
                out(factory.display());
                factory.changeLocation(
                    getInt("Please enter the light ID"), 
                    getDouble("Now enter the new location")
                );
            default:
                out("please enter a valid option");
        }
    }

	public void pressEnter(){
        Scanner in = new Scanner(System.in);
        out("Press enter to continue");
        in.nextLine();
    }

}