package level2.exercise2;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertSame;


public class ReferenceObjectTest {

    @Test
    public void assertion_demonstrated_the_reference_to_object_is_the_material_another(){
        String name = "test";
        String name1 = "test";

        Assertions.assertThat(name)
                .withFailMessage("The references do not point to the same object")
                .isSameAs(name1);


    }
    @Test
    public void diferentReference(){
        String summer = "Great";
        String summer1 = "Great";

        Assertions.assertThat(summer)
                .withFailMessage("The references do not point to the same object")
                .isSameAs(summer1);
    }
}
