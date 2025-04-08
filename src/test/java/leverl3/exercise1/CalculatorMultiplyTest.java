package leverl3.exercise1;

import level3.exercise1.dataClass.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorMultiplyTest {

    @Test
    public void calculator_multiply_test(){

        Calculator calculator = new Calculator();

        double result = calculator.multiply(9,28);

        assertThat(result)
                .withFailMessage("The result should be 252 but was " + result)
                .isEqualTo(252);
    }
    @Test
    public void calculator_multiply_by_zero_return_zero_test(){

        Calculator calculator = new Calculator();

        double result = calculator.multiply(0,28);

        assertThat(result)
                .withFailMessage("The result should be 0 but was " + result)
                .isEqualTo(0);
    }
    @Test
    public void calculator_multiply_positive_negative_numbers_test(){

        Calculator calculator = new Calculator();

        double result = calculator.multiply(-10,28);

        assertThat(result)
                .withFailMessage("The result should be -280 but was " + result)
                .isEqualTo(-280);
    }
    @Test
    public void calculator_multiply_only_negative_numbers_test(){

        Calculator calculator = new Calculator();

        double result = calculator.multiply(-10,-28);

        assertThat(result)
                .withFailMessage("The result should be 280 but was " + result)
                .isEqualTo(280);
    }
    @Test
    public void calculator_multiply_with_decimals_numbers_test(){

        Calculator calculator = new Calculator();

        double result = calculator.multiply(10.5,8.5);

        assertThat(result)
                .withFailMessage("The result should be 89.25 but was " + result)
                .isEqualTo(89.25);
    }
}
