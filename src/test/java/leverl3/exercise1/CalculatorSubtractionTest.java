package leverl3.exercise1;

import level3.exercise1.dataClass.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorSubtractionTest {

    @Test
    public void calculator_subtraction_test(){

        Calculator calculator = new Calculator();

        double result = calculator.subtraction(16,10);

        assertThat(result)
                .withFailMessage("The result should be 6 but was " + result)
                .isEqualTo(6);
    }
    @Test
    public void calculator_subtraction_negative_numbers_test(){

        Calculator calculator = new Calculator();

        double result = calculator.subtraction(-16,-10);

        assertThat(result)
                .withFailMessage("The result should be -6 but was " + result)
                .isEqualTo(-6);
    }
    @Test
    public void calculator_subtraction_negative_and_positive_numbers_test(){

        Calculator calculator = new Calculator();

        double result = calculator.subtraction(-16,10);

        assertThat(result)
                .withFailMessage("The result should be -6 but was " + result)
                .isEqualTo(-26);
    }

}
