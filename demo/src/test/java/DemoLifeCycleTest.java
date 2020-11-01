import org.junit.jupiter.api.*;

public class DemoLifeCycleTest {

    @BeforeAll
    public static void setup() {
        System.out.println("Call setup");
    }

    @AfterAll
    public static void teardown() {
        System.out.println("Call teardown");
    }

    @BeforeEach
    public void setupBeforeTest() {
        System.out.println("Call setupBeforeTest");
    }

    @AfterEach
    public void teardownAfterTest() {
        System.out.println("Call teardownAfterTest");
    }

    @Test
    public void demo() {

    }

}
