import java.util.Random;

public class MyGenerateId {

    Random random;

    public String getId() {
        int number = random.nextInt(10);
        String result = "XXX" + number;
        return result;
    }

}
