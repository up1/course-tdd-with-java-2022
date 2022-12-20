import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Workshop1Test {

    @Test
    @DisplayName("start with include [1,5] => 1")
    public void case03(){
        Workshop1 workshop1 = new Workshop1("[1,5]");
        int actualResult = workshop1.getStart();
        assertEquals(1, actualResult);
    }

    @Test
    @DisplayName("start with excluse (1,5] => 2")
    public void case04(){
        Workshop1 workshop1 = new Workshop1("(1,5]");
        int actualResult = workshop1.getStart();
        assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("start with include [1,5] => true")
    public void case01(){
        Workshop1 workshop1 = new Workshop1("[1,5]");
        boolean actualResult
                = workshop1.startWithInclude();
        assertTrue(actualResult);
    }

    @Test
    @DisplayName("start with exclude (1,5] => false")
    public void case02(){
        Workshop1 workshop1 = new Workshop1("(1,5]");
        boolean actualResult
                = workshop1.startWithInclude();
        assertFalse(actualResult);
    }

}
