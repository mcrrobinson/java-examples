public class Dashboard {


    public static void menuOptions(ConsoleEvents console, SmartBuilding factory) {

        console.out("MENU OPTIONS");
        console.out("please select option:");
        console.out("1 - toggle lights in a location");
        console.out("2 - move light switch to another location");
    
        int optionLevel = console.getInt("");
    
        switch (optionLevel) {
            case 1:
                console.out(factory.display());
                factory.toggle(console.getDouble("Enter the location you wish to toggle"));
                break;
            case 2:
                console.out(factory.display());
                factory.changeLocation(
                    console.getInt("Please enter the light ID"), 
                    console.getDouble("Now enter the new location")
                );
            default:
                console.out("please enter a valid option");
    
        }
    }
    public static void main(String[] args) {

        ConsoleEvents console = new ConsoleEvents();
        int size = console.getInt("Please enter number of light switches for this building");
        SmartBuilding factory = new SmartBuilding(size);

        for(int i = 0;i<factory.size();i++){
            System.out.println("please enter a value to store in the array: ");
            double location = console.getDouble("please enter location: ");
            boolean status = console.getBoolean("please enter light status: 1 - on, 0 - off");
            int id = console.getInt("please enter the light ID");
            factory.add(location, status, id);
        }

        while(true) {
            console.out(factory.display());
            console.menuOptions(factory);
        }
          
    }
}
