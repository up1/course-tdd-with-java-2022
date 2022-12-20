import java.util.Random;

public class MyGenerateId {

    public String getId() {
        Random random = new Random();
        int number = random.nextInt(10);
        String result = "XXX" + number;
        return result;
    }

}
