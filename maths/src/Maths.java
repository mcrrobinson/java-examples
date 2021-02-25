import java.util.Scanner;

public class Maths {

    static double circumferenceOfCircle(double radius) {
        return (2 * radius * Math.PI);
    }

    static double areaOfCircle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    static double diameterOfCircle(double circumference){
        return Math.PI * Math.pow(circumference /2, 2) * 1.5;
    }

    static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }

    private static void question1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius...");
        System.out.println("Circumference of the circle is, " + circumferenceOfCircle(input.nextDouble()));
    }

    private static void question2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius...");
        System.out.println("Area of the circle is, " + areaOfCircle(input.nextDouble()));
    }

    private static void question3(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a diameter of a circle...");
        System.out.println("Cost is, " + diameterOfCircle(input.nextDouble()));
    }

    private static void question4() {
        Scanner input = new Scanner(System.in);
        System.out.println("X1");
        double x1 = input.nextDouble();
        System.out.println("Y2");
        double y1 = input.nextDouble();
        System.out.println("X2");
        double x2 = input.nextDouble();
        System.out.println("Y2");
        double y2 = input.nextDouble();

        System.out.println("THe distance between the points is: " + distance(x1,y1,x2,y2));
    }

    private static void question5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter average speed: ");
        double speed = input.nextDouble();
        System.out.println("Enter the duration: ");
        double duration = input.nextDouble();

        double distance = speed * duration;
        double fuelAmount = distance / 5;
        System.out.println("Distance is: " + distance);
        System.out.println("Fuel consumption is: " + fuelAmount);
    }

    public static void main(String[] args) throws Exception {
        question1();
        question2();
        question3();
        question4();
        question5();
    }    
}
