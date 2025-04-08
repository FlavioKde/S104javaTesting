package level2.exercise6;


import level2.exercise6.logic.ManagementAiport;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class ArrayIndexOutOfBoundsExceptionTest {

    @Test
    public void arrayIndexOutOfBoundsException_It_is_thrown_when_it_touches(){

        ManagementAiport managementAiport = new ManagementAiport();

        Assertions.assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class)
                .isThrownBy(() -> {

                    managementAiport.addPlaneAiport();
                })
                .withMessageContaining("Index");



    }
}
