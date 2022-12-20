import java.util.Random;

interface IRandom {
    int nextInt(int bound);
}

public class MyGenerateId {

    IRandom random;

    public String getId() {
        int number = random.nextInt(10);
        String result = "XXX" + number;
        return result;
    }

}
