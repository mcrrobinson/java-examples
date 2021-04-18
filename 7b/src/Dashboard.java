public class Dashboard {

    public static void main(String[] args) {

        ConsoleEvents console = new ConsoleEvents();
        int size = console.getInt("Please enter number of light switches for this building");
        SmartBuilding factory = new SmartBuilding(size);

        for(int i = 0;i<factory.size();i++){
            System.out.println("please enter a value to store in the array: ");
            double location = console.getDouble("please enter location: ");
            boolean status = console.getBoolean("please enter light status: 1 - on, 0 - off");
            factory.add(status,location);
        }
        
    }
}
