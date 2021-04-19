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
        out("1 - house level options");
        out("2 - room level options");
        out("3 - plug level options");
        out("4 - system options");
    
        int optionLevel = getInt("");
    
        switch (optionLevel) {
            case 1:
                break;
                // out(factory.display());
                // factory.toggle(getInt("Enter the room you wish to change"));
                // break;
            case 2:
                break;
                // out(factory.display());
                // factory.changeRoom(
                //     getInt("Please enter the smart plug ID"), 
                //     getInt("Now enter the new room")
                // );
            case 3:
                break;
            case 4:
                break;
            default:
                out("please enter a valid option");
                break;
        }
    }

	public void pressEnter(){
        Scanner in = new Scanner(System.in);
        out("Press enter to continue");
        in.nextLine();
    }

}