import java.util.Scanner;

public class App {
    public static Scanner userInput(String userRequestString) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(userRequestString);
        return userInput;
    }

    private static void sugarIntake(){
        float sugarIntake = 0;
        while (true) {
            sugarIntake += userInput("Enter the amount of sugar: ").nextInt();
            if((userInput("Type \"stop\" to exit the loop: ").nextLine().equals("stop"))){
                break;
            }
        }
        System.out.println(sugarIntake);
    }

    private static void maximumSugarValue(){
        int maxSugarValue = userInput("Enter the maximum amount of sugar in grams: ").nextInt();
        int currentSugarValue = 0;
        while (true) {
            currentSugarValue += userInput("Enter the amount of sugar: ").nextInt();
            if(currentSugarValue > maxSugarValue){
                System.out.println("You have gone over your sugar intake for the meal.");
                break;
            }
        }
        System.out.println(currentSugarValue);
    }

    private static void toRecycle(){
        int recycleNumber = 0;
        System.out.println("Enter \"stop\" to exit the loop.");
        while (true) {
            String recycle = userInput("Enter item to be recycled: ").nextLine();
            // Id like to use a switch but breaking out twice aint fun.
            if(recycle.equals("stop")){
                break;
            } else if(recycle.equals("plastic")) {
                recycleNumber += 1;
            } else if(recycle.equals("glass")) {
                recycleNumber += 3;
            } else if(recycle.equals("cardboard")) {
                recycleNumber += 2;
            } else {
                System.out.printf("%s isn't a valid input. Please enter either; plastic, glass, cardboard or stop.\n",recycle);
            }
        }
        System.out.printf("%d points.\n", recycleNumber);
    }
    public static void main(String[] args) throws Exception {
        sugarIntake();
        maximumSugarValue();
        // toRecycle();
    }
}
