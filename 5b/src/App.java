import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<String> list = new ArrayList<String>();
    
    public static Scanner userInput(String userRequestString) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(userRequestString);
        return userInput;
    }
    
    private static void generateArray(){
        int arraySize = userInput("Enter the size of the array: ").nextInt();
        for (int i = 0; i < arraySize; i++) {
            list.add(userInput("Enter a string: ").nextLine());
        }
        System.out.println(list);
    }
    public static void main(String[] args) throws Exception {
        generateArray();
        System.out.printf("Occurences: %d\n",
            Collections.frequency(
                list, 
                userInput("Enter a word you wish to check occurences against: ").nextLine()
            )
        );
    }
}
