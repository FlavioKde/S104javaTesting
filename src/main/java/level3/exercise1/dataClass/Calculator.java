package level3.exercise1.dataClass;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
    private double result;

    public Calculator(){
        this.result = 0;


    }
    public double addition(double a, double b){
        result = a + b;

        return roundToTwoDecimals(result);

    }
    public double subtraction(double a, double b){
        result = a - b;

        return roundToTwoDecimals(result);

    }
    public double multiply(double a, double b){
        result = a * b;

        return roundToTwoDecimals(result);
    }
    public double division(double a, double b){

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
       return roundToTwoDecimals( a / b);

    }
    private double roundToTwoDecimals(double value) {
        return BigDecimal.valueOf(value)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }


    @Override
    public String toString() {
        return "Calculator{" +
                "result=" + result +
                '}';
    }
}
