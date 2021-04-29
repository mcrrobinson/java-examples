public class App {
    public static void main(String[] args) {
        ConsoleEvents console = new ConsoleEvents();

        int plugs = console.readInt("Enter total smart plugs for the building: ");
        int rooms = console.readInt("Enter total rooms in this building:  ");;

        SmartBuilding factory = new SmartBuilding(plugs, rooms);

        // Populate Rooms
        for (int i = 0; i < rooms; i++) {
            String room = console.get("Enter Room Name: ").nextLine();
            factory.addSmartRoom(room);
        }

        // Populate Smart Plugs
        for (int i = 0; i < plugs; i++) {
            int applianceID = console.verifyBounds(factory.displaySmartAppliances(), "Enter appliance ID: ", factory.sizeSmartAppliance());
            int roomID = console.verifyBounds(factory.displaySmartRooms(), "Enter the Room ID: ", factory.sizeSmartRoom());
            boolean status = console.readInt("Enter plug status (1 = ON | 0 = OFF): ") == 1 ? true : false;
            factory.addSmartPlug(applianceID, roomID, status);
        }

        while(true) {
            console.out(factory.displayAll());
            console.menuOptions(factory);
        }
    }
}
