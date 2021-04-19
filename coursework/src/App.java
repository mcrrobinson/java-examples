public class App {
    public static void main(String[] args) {

        ConsoleEvents console = new ConsoleEvents();
        int size = console.getInt("Please enter number of smart plug switches for this building");
        SmartBuilding factory = new SmartBuilding(size);

        for(int i = 0;i<factory.size();i++){
            System.out.println("please enter a value to store in the array: ");
            String room = console.getString("please enter the room name ");
            boolean status = console.getBoolean("please enter smart plug status: 1 - on, 0 - off");
            factory.add(room, status);
        }

        while(true) {
            console.out(factory.display());
            console.menuOptions(factory);
        }
          
    }
}
