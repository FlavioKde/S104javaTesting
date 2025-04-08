package level1.exercise2.logic;

import level1.exercise2.dataClass.CalculationID;

import java.util.ArrayList;
import java.util.List;

public class ManagementCalculationID {
    private List<Integer>idNumbers;

    public ManagementCalculationID(){
       this.idNumbers = new ArrayList<>();

       idNumbers.add(12345678);
       idNumbers.add(29876543);
       idNumbers.add(34567654);
       idNumbers.add(12347654);
       idNumbers.add(98765432);
       idNumbers.add(76543786);
       idNumbers.add(65478976);
       idNumbers.add(56743287);
       idNumbers.add(65432897);
       idNumbers.add(78654237);


    }

    public List<Integer> getIdNumbers() {
        return idNumbers;
    }
    public void calculateAndPrintID(){
        System.out.println("DNI Calculations:");
        for(int dni: idNumbers){
            CalculationID calculationID = new CalculationID(dni);
            System.out.println("ID "+ dni + " Letter: "+calculationID.calculateLetter(dni));

        }
    }
}
