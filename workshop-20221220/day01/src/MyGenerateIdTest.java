import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MyRandom6 implements IRandom{
    @Override
    public int nextInt(int bound) {
        return 6;
    }
}

class MyGenerateIdTest {
    @Test
    void getIdWith6() {
        IRandom random = new MyRandom6();
        MyGenerateId m = new MyGenerateId();
        // Field,property injection
        m.random = random;
        assertEquals("XXX6", m.getId());
    }
}