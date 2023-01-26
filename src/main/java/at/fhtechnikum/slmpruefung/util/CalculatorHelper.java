package at.fhtechnikum.slmpruefung.util;

public class CalculatorHelper {
    public static double calcCircle(double value){
        double area = Math.PI * Math.pow(value,2);
        area = Math.round(area * 100.0) / 100.0;
        return area;
    }
    public static double calcSquare(double value) {
        double area = Math.pow(value,2);
        area = Math.round(area * 100.0) / 100.0;
        return area;
    }
}
