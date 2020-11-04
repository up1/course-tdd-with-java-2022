import java.util.Random;

public class NumberService {

    public int getData(IRandom random) {
        return random.nextInt(10) * 10;
    }

}
