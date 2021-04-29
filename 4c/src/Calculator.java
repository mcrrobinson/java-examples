public class Calculator {
    public float areaOfCircle(float radius){
        return (float)Math.PI * radius * radius;
    }
    public double distanceBetweenPoints(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x1-x2), 2) + (Math.pow(y1-y2, 2)));
    }
    public double distanceBetweenPoints(double[] x, double[] y){
        return Math.sqrt(Math.pow((x[0]-x[1]), 2) + (Math.pow(y[0]-y[1], 2)));
    }
    public double arrayDoubleSum(double[] arr){
        return DoubleStream.of(arr).sum();
    }
    public double arrayDoubleMultiply(double[] arr){
        double result=1;
        for(double value : arr) {
            result *= value;
        } 
        return result;
    }
}
