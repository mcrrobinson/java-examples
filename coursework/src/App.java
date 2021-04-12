public class App {
    public static void main(String[] args) throws Exception {

        // Initialise the size of the array
        SmartBuilding smartBuilding = new SmartBuilding(5);

        // Populate the array. Use an add() method and an appropriate way of ensuring that you do not go out of bounds
        for (int i = 0; i < smartBuilding.size(); i++) {
            smartBuilding.add(i,i%2 > 0 ? true: false);
        }

        // Display all values in the array.
        System.out.printf("Before:\t %s\n", smartBuilding.display());  
        
        // Update a value in the smart light? Use the strategy guidance. 
        smartBuilding.updateObject(3);
        System.out.printf("After:\t %s\n",smartBuilding.display());  

    }
}
