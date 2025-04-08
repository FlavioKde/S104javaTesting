package level2.exercise5;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    @Test
    public void create_map_verify_have_one_of_the_keys_that_I_affected(){
        Map<Integer, String> nameMap = new HashMap<>();

        nameMap.put(1,"String1");
        nameMap.put(2,"String2");
        nameMap.put(3,"String3");

        Assertions.assertThat(nameMap)
                .containsKey(1)
                .withFailMessage("Expected key '1' to be present, but it was not found.")
                .containsValue("String1")
                .withFailMessage("Expected value 'String1' to be present, but it was not found.")
                .doesNotContainKey(4)
                .withFailMessage("Unexpected key '4' was found in the map.");


    }

}
