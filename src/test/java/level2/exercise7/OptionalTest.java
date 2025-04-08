package level2.exercise7;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Optional;

public class OptionalTest {

    @Test
    public void optional_built_object_verify(){

        Optional<String> optional = Optional.empty();

        assertThat(optional)
                .withFailMessage("The Optional should be empty")
                .isEmpty();

    }
}
