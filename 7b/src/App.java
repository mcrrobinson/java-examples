import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter size of array: ");
        int arrSize = input.nextInt();
    
        SmartBuilding iArr = new SmartBuilding(arrSize);
    
        for(int i = 0;i<arrSize;i++){
            System.out.println("please enter a value to store in the array: ");
            int arrValue = input.nextInt();
            iArr.add(arrValue);
        }
    }
}
