import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyGenerateIdTest {

    @Test
    void getIdWith6() {
        MyGenerateId m = new MyGenerateId();
        assertEquals("XXX6", m.getId());
    }
}