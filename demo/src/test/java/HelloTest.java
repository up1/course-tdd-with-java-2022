import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HelloTest {

    @Test
    @Disabled
    @DisplayName("throws SomException when called hi")
    void throwsExceptionWhenCalledHi() {
        Hello hello = new Hello();
        SomeException exception = assertThrows(SomeException.class, () ->
            hello.say("error")
        );

        assertEquals(exception.getMessage(), "Some exception");

    }

    @Test
    @DisplayName("สวัสดี JUnit 5")
    public void testcase01() {
        // Arrange
        Hello hello = new Hello();
        // Act
        String actualResult = hello.say("demo");
        // Assert
        assertEquals("Hello demo", actualResult);
    }



}
