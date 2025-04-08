package leverl3.exercise1;

import level3.exercise1.dataClass.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorAdditionTest {

    @Test
    public void calculator_addition_test(){

        Calculator calculator = new Calculator();

        double result = calculator.addition(5,9);

        assertThat(result)
                .withFailMessage("The result should be 14 but was " + result)
                .isEqualTo(14);

    }
    @Test
    public void calculator_addition_negative_numbers_test(){

        Calculator calculator = new Calculator();

        double result = calculator.addition(-5,-9);

        assertThat(result)
                .withFailMessage("The result should be -14 but was " + result)
                .isEqualTo(-14);

    }
    @Test
    public void calculator_addition_negative_and_positive__numbers_test(){

        Calculator calculator = new Calculator();

        double result = calculator.addition(-5,9);

        assertThat(result)
                .withFailMessage("The result should be 4 but was " + result)
                .isEqualTo(4);

    }
}
