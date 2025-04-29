package leverl3.exercise1;

import level3.exercise1.dataClass.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class CalculatorDivisionTest {

    @Test
    public void calculator_division_by_zero_should_throw_exception_test(){

        Calculator calculator = new Calculator();

        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> calculator.division(5, 0))
                .withMessage("Cannot divide by zero");
    }
    @Test
    public void calculator_division_test(){

        Calculator calculator = new Calculator();

        double result = calculator.division(9,3);

        assertThat(result)
                .withFailMessage("The result should be 3 but was " + result)
                .isEqualTo(3);
    }
    @Test
    public void calculator_division_with_return_decimals_number_test(){

        Calculator calculator = new Calculator();

        double result = calculator.division(28,9);

        assertThat(result)
                .withFailMessage("The result should be 3.11 but was " + result)
                .isEqualTo(3.11);
    }
    @Test
    public void calculator_division_positive_negative_numbers_test(){

        Calculator calculator = new Calculator();

        double result = calculator.division(-9,3);

        assertThat(result)
                .withFailMessage("The result should be -3 but was " + result)
                .isEqualTo(-3);
    }
    @Test
    public void calculator_division_only_negative_numbers_test(){

        Calculator calculator = new Calculator();

        double result = calculator.division(-10,-5);

        assertThat(result)
                .withFailMessage("The result should be 2 but was " + result)
                .isEqualTo(2);
    }
    @Test
    public void calculator_division_with_decimals_numbers_test(){

        Calculator calculator = new Calculator();

        double result = calculator.division(10.5,8.5);

        assertThat(result)
                .withFailMessage("The result should be 1.24 but was " + result)
                .isEqualTo(1.24);
    }
}
