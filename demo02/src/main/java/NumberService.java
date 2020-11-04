import java.util.Random;

public class NumberService {

    public NumberService(Random myRandom) {

    }

    public int getData(Random random) {
        return random.nextInt(10) * 10;
    }

    public void setRandom(Random myRandom) {

    }
}
