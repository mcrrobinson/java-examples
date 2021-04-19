import java.util.Scanner;

public class App {

    public static Scanner get(String string) {
        Scanner in = new Scanner(System.in);
        System.out.println(string);
        return in;
    }

    public static boolean handler(int status){
        return status == 1 ? true: false;
    }

    public static void menuOptions(SmartBuilding factory) {
        System.out.println("MENU OPTIONS");
        System.out.println("please select option:");
        System.out.println("1 - house level options");
        System.out.println("2 - room level options");
        System.out.println("3 - plug level options");
        System.out.println("4 - system options");
    
        int optionLevel = get("").nextInt();
    
        switch (optionLevel) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("please enter a valid option");
                break;
        }
    }

    public static void main(String[] args) {
        int size = get("Please enter number of smart plug switches for this building").nextInt();
        SmartBuilding factory = new SmartBuilding(size);

        for(int i = 0;i<factory.sizeSmartPlug();i++){
            String appliance = get("Enter appliance name: ").nextLine();
            String room = get("Enter room name: ").nextLine();
            boolean status = handler(get("Enter plug status (1 = ON | 0 = OFF): ").nextInt());
            System.out.printf("Appliance: %s, Room: %s, Plug: %b\n",appliance, room, status);

            factory.addSmartPlug(appliance, room, status);
        }

        // while(true) {
        factory.display();
        menuOptions(factory);
        // }
          
    }
}
