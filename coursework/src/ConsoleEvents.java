import java.util.Scanner;

public class ConsoleEvents {

    <T> void out(T message) {
        System.out.println(message);
    }

    public Scanner get(String string) {
        Scanner in = new Scanner(System.in);
        out(string);
        return in;
    }

    public int readInt(String message){
        while (true) {
            Scanner out = get(message);
            if(out.hasNextInt()) return out.nextInt();
        }
    }

    public int verifyBounds(String displayString, String message, int upperBound) {
        out(displayString);
        while (true) {
            int out = readInt(message);
            if (out >= 0 && out < upperBound ) return out;
        }
    }

    public void houseOptions(SmartBuilding factory) {
        out("\nHOUSE OPTIONS");
        out("Please select an option:");
        out("1 - Switch all plugs off");
        out("2 - Switch all plugs on");
        switch (readInt("")) {
        case 1:
            factory.disableAllPlugs();
            break;
        case 2:
            factory.enableAllPlugs();
            break;
        default:
            out("please enter a valid option");
        }
    }

    public void roomOptions(SmartBuilding factory) {
        out(factory.displaySmartRooms());

        int room = readInt("Please select a room:");
        out("\nROOM OPTIONS");
        out("1 - Switch all plugs off");
        out("2 - Switch all plugs on");
        out("3 - Toggle specific device");
        switch (readInt("")) {
        case 1:
            factory.disableAllRoomPlugs(room);
            break;
        case 2:
            factory.enableAllRoomPlugs(room);
            break;
        case 3:
            out(factory.displaySmartPlugs(room));
            factory.togglePlug(readInt("Select a plug to toggle:"));
            break;
        default:
            out("please enter a valid option");
        }
    }

    public void smartPlugOptions(SmartBuilding factory) {
        out(factory.displaySmartPlugs());
        int plug = readInt("Select a plug:");

        out("\nPLUG OPTIONS");
        out("1 - Switch plug off");
        out("2 - Switch plug on");
        out("3 - Change attached device");
        out("4 - Move plug to different room");
        switch (readInt("Enter an option: ")) {
        case 1:
            factory.disablePlug(plug);
            break;
        case 2:
            factory.enablePlug(plug);
            break;
        case 3:
            out(factory.displaySmartAppliances());
            int applianceID = readInt("Enter the new appliance ID: ");
            factory.changePlugAppliance(plug, applianceID);
            break;
        case 4:
            out(factory.displaySmartRooms());
            int roomID = readInt("Enter new room ID: ");
            factory.changePlugRoom(plug, roomID);
            break;
        default:
            out("please enter a valid option");
        }
    }

    public void systemOptions(SmartBuilding factory) {
        out(factory.displaySmartPlugs());
        out("Please select a plug:");
        out("\nPLUG OPTIONS");
        out("1 - Add more smart plugs");
        out("2 - Add more rooms");
        out("3 - Add more appliances");
        switch (get("").nextInt()) {
        case 1:
            int plugs = readInt("Enter the amount of plugs you wish to add: ");
            for (int i = 0; i < plugs; i++) {

                // Enter the appliance ID for the plug.
                out(factory.displaySmartAppliances());
                int appliance = readInt("Enter appliance ID: ");

                // Enter the room ID for the plug.
                out(factory.displaySmartRooms());
                int roomID = readInt("Enter the Room ID:");

                // Enter the plug status.
                boolean status = readInt("Enter plug status (1 = ON | 0 = OFF): ") == 1 ? true : false;

                factory.addSmartPlug(appliance, roomID, status, true);
            }
            break;
        case 2:
            int rooms = readInt("Enter the amount of rooms you wish to add: ");
            for (int i = 0; i < rooms; i++) {
                String room = get("Enter Room Name: ").nextLine();
                factory.addSmartRoom(room, true);
            }
            break;
        case 3:
            int appliances = readInt("Enter the amount of appliances you wish to add: ");
            for (int i = 0; i < appliances; i++) {
                String appliance = get("Enter Appliance Name: ").nextLine();
                factory.addSmartAppliance(appliance);
            }
            break;
        default:
            out("please enter a valid option");
        }
    }

    public void menuOptions(SmartBuilding factory) {
        out("\nMENU OPTIONS");
        out("please select option:");
        out("1 - house level options");
        out("2 - room level options");
        out("3 - plug level options");
        out("4 - system options");
        switch (readInt("")) {
        case 1:
            houseOptions(factory);
            break;
        case 2:
            roomOptions(factory);
            break;
        case 3:
            smartPlugOptions(factory);
            break;
        case 4:
            systemOptions(factory);
            break;
        default:
            out("please enter a valid option");
        }
    }
}
