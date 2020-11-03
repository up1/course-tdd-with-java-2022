import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRangeTest {

    @Test
    public void getResult1() {
        MyRange r = new MyRange("[1,5]");
        String result = r.getResult();
        assertEquals("1,2,3,4,5", result);
    }

//    @Test
//    public void getEndNumberWithInclude() {
//        MyRange r = new MyRange("[1,5]");
//        int result = r.getEnd();
//        assertEquals(5, result);
//    }

    @Test
    public void getStartNumberWithExclude() {
        MyRange r = new MyRange("(1,5]");
        int result = r.getStart();
        assertEquals(2, result);
    }

    @Test
    public void getStartNumberWithInclude() {
        MyRange r = new MyRange("[1,5]");
        int result = r.getStart();
        assertEquals(1, result);
    }

    @Test
    @DisplayName("input ต้องปิดท้ายด้วย ) (include)")
    public void inputShouldEndWithExclude() {
        MyRange r = new MyRange("[1,5)");
        boolean result = r.endWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("input ต้องปิดท้ายด้วย ] (include)")
    public void inputShouldEndWithInclude() {
        MyRange r = new MyRange("[1,5]");
        boolean result = r.endWithInclude();
        assertTrue(result);
    }

    @Test
    @DisplayName("input ต้องขึ้นต้นด้วย ( (exclude)")
    public void inputShouldStartWithExclude() {
        MyRange r = new MyRange("(1,5]");
        boolean result = r.startWithInclude();
        assertFalse(result);
    }

    @Test
    @DisplayName("input ต้องขึ้นต้นด้วย [ (include)")
    public void inputShouldStartWithInclude() {
        MyRange r = new MyRange("[1,5]");
        boolean result = r.startWithInclude();
        assertTrue(result);
    }

}