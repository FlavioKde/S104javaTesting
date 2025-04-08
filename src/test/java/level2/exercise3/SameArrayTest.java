package level2.exercise3;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class SameArrayTest {

    @Test
    public void assertion_indicates_two_arrays_of_inputs_identical(){
        int[] number = {1,2,3,4,5};
        int[] number1 = {6,7,8,9,10};

        Assertions.assertThat(number).
        withFailMessage("The arrays are different").
        containsExactly(number1);

        }
    @Test
    public void sameIntegerArray(){
        int[] numberSummer = {10, 20, 30, 40 , 50};
        int[] numberSummer2 = {10, 20, 30, 40, 50};

        Assertions.assertThat(numberSummer).
        withFailMessage("The arrays are not diferent").
        containsExactly(numberSummer2);
    }
    }


