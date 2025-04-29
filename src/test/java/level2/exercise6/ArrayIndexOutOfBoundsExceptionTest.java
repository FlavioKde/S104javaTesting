package level2.exercise6;


import level2.exercise6.logic.ManagementAiport;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayIndexOutOfBoundsExceptionTest {

    @Test
    public void arrayIndexOutOfBoundsException_It_is_thrown_when_it_touches(){

        ManagementAiport managementAiport = new ManagementAiport();

        assertThrows(ArrayIndexOutOfBoundsException.class,
                managementAiport::triggerOutOfBounds,
                "Expected ArrayIndexOutOfBoundsException to be thrown");

    }
}
