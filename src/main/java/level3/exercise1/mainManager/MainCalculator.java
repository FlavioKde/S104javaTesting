package level3.exercise1.mainManager;

import level3.exercise1.dataClass.Calculator;
import level3.exercise1.logic.PrintResult;

public class MainCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        PrintResult.resultPrint(calculator.addition(5,9));
        PrintResult.resultPrint(calculator.subtraction(89,45));
        PrintResult.resultPrint(calculator.division(17,8));
        PrintResult.resultPrint(calculator.multiply(345,99));


    }
}