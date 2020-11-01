import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoParameterizedTest {

    @ParameterizedTest(name = "sayHi with {0} is {1}")
    @CsvSource({
            "user 01,    Hello user 01",
            "user 02,    Hello user 02",
    })
    public void sayHi(String username, String expectedResult) {
        assertEquals(expectedResult, process(username));
    }

    private String process(String username) {
        return "Hello " + username;
    }

}
