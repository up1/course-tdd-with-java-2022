import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class Workshop1Test {

    @Test
    public void case08(){
        Workshop1 workshop1 = new Workshop1("*1,5*");
        try {
            workshop1.getResult();
            fail("Exception not occur");
        }catch (RuntimeException e) {
            if(!"Input Error".equals(e.getMessage())) {
                fail("Error Message invalid");
            }
        }
    }

    @ParameterizedTest
    @CsvSource({
            "'[1,5]', '1,2,3,4,5'",
            "'(1,5]', '2,3,4,5'",
            "'[1,5)', '1,2,3,4'"
    })
    public void flow(String input, String expectedResult) {
        Workshop1 workshop1 = new Workshop1(input);
        String actualResult = workshop1.getResult();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("[1,5] => 1,2,3,4,5")
    public void case05() {
        Workshop1 workshop1 = new Workshop1("[1,5]");
        String actualResult = workshop1.getResult();
        assertEquals("1,2,3,4,5", actualResult);
    }

    @Test
    @DisplayName("(1,5] => 2,3,4,5")
    public void case07() {
        Workshop1 workshop1 = new Workshop1("(1,5]");
        String actualResult = workshop1.getResult();
        assertEquals("2,3,4,5", actualResult);
    }

    @Test
    @DisplayName("[1,5) => 1,2,3,4")
    public void case06() {
        Workshop1 workshop1 = new Workshop1("[1,5)");
        String actualResult = workshop1.getResult();
        assertEquals("1,2,3,4", actualResult);
    }

    @Test
    @DisplayName("start with include [1,5] => 1")
    public void case03() {
        Workshop1 workshop1 = new Workshop1("[1,5]");
        int actualResult = workshop1.getStart();
        assertEquals(1, actualResult);
    }

    @Test
    @DisplayName("start with excluse (1,5] => 2")
    public void case04() {
        Workshop1 workshop1 = new Workshop1("(1,5]");
        int actualResult = workshop1.getStart();
        assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("start with include [1,5] => true")
    public void case01() {
        Workshop1 workshop1 = new Workshop1("[1,5]");
        boolean actualResult
                = workshop1.startWithInclude();
        assertTrue(actualResult);
    }

    @Test
    @DisplayName("start with exclude (1,5] => false")
    public void case02() {
        Workshop1 workshop1 = new Workshop1("(1,5]");
        boolean actualResult
                = workshop1.startWithInclude();
        assertFalse(actualResult);
    }

}
