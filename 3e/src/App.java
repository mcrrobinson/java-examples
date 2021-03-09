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
            if(!(userInput("Type \"stop\" to exit the loop: ").nextLine().equals("stop"))){
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
    public static void main(String[] args) throws Exception {
        // sugarIntake();
        maximumSugarValue();
    }
}
