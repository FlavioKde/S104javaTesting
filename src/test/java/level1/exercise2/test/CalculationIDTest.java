package level1.exercise2.test;

import level1.exercise2.dataClass.CalculationID;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationIDTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "29876543, A",
            "34567654, B",
            "12347654, N",
            "98765432, M",
            "76543786, Q",
            "65478976, T",
            "56743287, X",
            "65432897, J",
            "78654237, X"
    })
    public void testCalculateDniLetter(int dni, String expectedLetter) {
        CalculationID calculoDni = new CalculationID(dni);
        assertEquals(expectedLetter, calculoDni.calculateLetter(dni),
                "The calculated letter does not match the one expected for the ID: " + dni);
    }
}






