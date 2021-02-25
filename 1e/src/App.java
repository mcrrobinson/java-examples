import java.util.Calendar;
import java.util.Scanner;

public class App {
    private static float userAddition(float a, float b) {
        return a + b;
    }
    private static float userMultiplication(float a, float b){
        return a * b;
    }
    private static float userSubtraction(float a, float b){
        return a - b;
    }
    private static float userDivision(float a, float b){
        if(b==0){
            System.out.println("You can't divide by 0.");
            return 0;
        }
        return a / b;
    }
    private static int userAge(int year, int month) {
        Calendar calenderInstance = Calendar.getInstance();
        int current_year = calenderInstance.get(Calendar.YEAR);
        if(calenderInstance.get(Calendar.MONTH) + 1 < month){
            current_year -= 1;
        }
        return current_year - year;
    }
    private static float fahrenheitToCelsius(float fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
    private static float celsiusToFahrenheit(float celsius){
        return celsius * 9/5 + 32;
    }

    private static Scanner userInput(String userRequestString){
        Scanner userInput = new Scanner(System.in);
        System.out.println(userRequestString);
        return userInput;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(userAddition(
            userInput("Enter your first integer: ").nextFloat(), 
            userInput("Enter a second integer: ").nextFloat()));
        System.out.println(userMultiplication(
            userInput("Enter your first integer: ").nextFloat(), 
            userInput("Enter your second integer: ").nextFloat()));
        System.out.println(userSubtraction(
            userInput("Enter your first integer: ").nextFloat(), 
            userInput("Enter your second integer: ").nextFloat()));
        System.out.println(userDivision(
            userInput("Enter your first integer: ").nextFloat(), 
            userInput("Enter your second integer: ").nextFloat()));
        System.out.println(userAge(
            userInput("Enter the year you were born: ").nextInt(),
            userInput("Enter your birth month from 1-12: ").nextInt()));
        System.out.println(fahrenheitToCelsius(
            userInput("Enter your fahrenheit value: ").nextFloat()));
        System.out.println(celsiusToFahrenheit(
            userInput("Enter your celsius value: ").nextFloat()));
    }
}
