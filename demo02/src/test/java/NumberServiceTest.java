import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MyRandom extends Random {
    @Override
    public int nextInt(int bound) {
        return 5;
    }
}

class NumberServiceTest {
    @Test
    public void get_number_5() {
        Random myRandom = new MyRandom();
        // Constructor Injection
        NumberService numberService = new NumberService(myRandom);
        // Property/Setter Injection
        numberService.setRandom(myRandom);
        // Method Injection
        int result = numberService.getData(myRandom);
        assertEquals(50, result);
    }
}