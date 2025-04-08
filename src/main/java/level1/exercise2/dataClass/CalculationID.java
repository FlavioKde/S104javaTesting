package level1.exercise2.dataClass;

import java.util.ArrayList;
import java.util.Arrays;


public class CalculationID {
    private int numbers;

    public CalculationID(int numbers){
        this.numbers = numbers;
    }

    public int getNumberId() {
        return numbers;
    }

    public String calculateLetter(int numberID){



        ArrayList<String> letters = new ArrayList<>(Arrays.asList("T", "R", "W", "A", "G",
                "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"));


        int operation = numberID % 23;


        String calculatingLetters = letters.get(operation);


        return calculatingLetters;

    }

    @Override
    public String toString() {
        return "CalculationID{" +
                "numberId=" + numbers +
                ", calculatedLetter=" + calculateLetter(numbers) +
                '}';
    }
}
