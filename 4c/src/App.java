import java.util.stream.DoubleStream;

public class App {
    public static float areaOfCircle(float radius){
        return (float)Math.PI * radius * radius;
    }
    public static double distanceBetweenPoints(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x1-x2), 2) + (Math.pow(y1-y2, 2)));
    }
    public static double distanceBetweenPoints(double[] x, double[] y){
        return Math.sqrt(Math.pow((x[0]-x[1]), 2) + (Math.pow(y[0]-y[1], 2)));
    }
    public static double arrayDoubleSum(double[] arr){
        return DoubleStream.of(arr).sum();
    }
    public static double arrayDoubleMultiply(double[] arr){
        double result=1;
        for(double value : arr) {
            result *= value;
        } 
        return result;
    }
    public static void main(String[] args) throws Exception {
        double[] dblArr = {3.45,7.8,4.45,5.78,9};
        System.out.println(arrayDoubleMultiply(dblArr));
    }
}
