package level2.exercise1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertTest {

    @Test
    public void asserted_demonstrated_the_value_two_common_objects_is_equal(){
        Integer number = 5;
        Integer number1 = 5;

        assertThat(number).isEqualTo(number1);
        System.out.println("The test passed: both values are equal");

    }
    @Test
    public void asserted_demonstrated_the_value_two_common_objects_is_equal_notequalityTest(){
        Integer day = 25;
        Integer day1 = 29;

        assertThat(day).isNotEqualTo(day1).
                 withFailMessage("The test must pass, since the values are different");
        System.out.println("The test passed: both values are not equal");

    }
    @Test
    public void intEqualityTest(){
        int summer = 10;
        int summer1 = 10;

        assertThat(summer).isEqualTo(summer1);
        System.out.println("The test passed: both values are equal");
    }
    @Test
    public void intNotEqualityTest(){
        int winter = 56;
        int winter1 = 32;

        assertThat(winter).isNotEqualTo(winter1).
                withFailMessage("the test must fail, since they are different");
        System.out.println("The test passed: both values are not equal");

    }
}
