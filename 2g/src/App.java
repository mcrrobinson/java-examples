import java.util.Scanner;

public class App {
    /*
        Takes the user input based on the string entered, set public
        as it's useful as a helper function.
    */
    public static Scanner userInput(String userRequestString) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(userRequestString);
        return userInput;
    }

    private static int exceedLimitA(int upperLimit, int exceed) {
        while (exceed < upperLimit) {
            exceed += userInput("Enter a number: ").nextInt();
        }
        return exceed;
    }

    private static void oneA() {
        int exceed = 0;
        exceed = exceedLimitA(userInput("Enter the upper boundary: ").nextInt(), exceed);

        String queryUpdatedLimit = userInput("Do you wish to increase the upper limit? (Y/N)").nextLine();
        if (queryUpdatedLimit.equals("Y") || queryUpdatedLimit.equals("y")) {
            exceed = exceedLimitA(userInput("What do you wish to increase it by? ").nextInt(), exceed);
        }
        System.out.println(exceed);
    }

    
    /*
        Checks to see if a number is a prime, use public as could
        be a useful helper function.
    */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0) return false;
        return true;
    }

    private static int exceedLimitB(int upperLimit, int exceed) {
        while (exceed < upperLimit) {
            int value = userInput("Enter a number: ").nextInt();
            if (isPrime(value))
                exceed += value; // If prime number add to sum.
        }
        return exceed;
    }

    private static void oneB() {
        int exceed = 0;
        exceed = exceedLimitB(userInput("Enter the upper boundary: ").nextInt(), exceed);

        String queryUpdatedLimit = userInput("Do you wish to increase the upper limit? (Y/N)").nextLine();
        if (queryUpdatedLimit.equals("Y") || queryUpdatedLimit.equals("y")) {
            exceed = exceedLimitB(userInput("What do you wish to increase it by? ").nextInt(), exceed);
        }
        System.out.println(exceed);
    }

    private static int exceedLimitC(int upperLimit, int exceed) {
        while (exceed < upperLimit) {
            int value = userInput("Enter a number: ").nextInt();
            if (exceed % value != 0 || exceed == 0) exceed += value; // Ignore 0 because every number is factor of zero.
        }
        return exceed;
    }

    private static void oneC() {
        int exceed = 0;
        exceed = exceedLimitC(userInput("Enter the upper boundary: ").nextInt(), exceed);

        String queryUpdatedLimit = userInput("Do you wish to increase the upper limit? (Y/N)").nextLine();
        if (queryUpdatedLimit.equals("Y") || queryUpdatedLimit.equals("y")) {
            exceed = exceedLimitC(userInput("What do you wish to increase it by? ").nextInt(), exceed);
        }
        System.out.println(exceed);
    }

    public static void main(String[] args) throws Exception {
        oneA();
        oneB();
        oneC();
    }
}
