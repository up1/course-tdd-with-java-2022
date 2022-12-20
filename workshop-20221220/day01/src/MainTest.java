import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("method sayHello() จะต้อง return ค่า Hello World !")
    public void case01(){
        Main main = new Main();
        String actualResult = main.sayHello();
        assertEquals("Hello world!", actualResult);
    }

}