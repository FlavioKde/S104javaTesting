package level1.exercise3.test;

import level1.exercise3.logic.ManagementOutOfBounds;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ManagementOutOfBoundsTest {

    @Test
    public void testArrayIndexOutOfBoundsException() {

        ManagementOutOfBounds management = new ManagementOutOfBounds();


        assertThrows(ArrayIndexOutOfBoundsException.class, management::addPeopleBounds,
                "Expected ArrayIndexOutOfBoundsException to be thrown");
    }
}
