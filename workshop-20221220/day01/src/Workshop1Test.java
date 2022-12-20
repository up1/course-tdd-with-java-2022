import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Workshop1Test {

    @Test
    @DisplayName("start with include [1,5] => true")
    public void case01(){
        Workshop1 workshop1 = new Workshop1("[1,5]");
        boolean actualResult = workshop1.startWithInclude();
        assertTrue(actualResult);
    }

}
