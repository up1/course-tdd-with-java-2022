import static java.lang.Integer.*;

public class Workshop1 {
    public static final int ASCII_VALUE_OF_ZERO = 48;
    private final String input;

    public Workshop1(String input) {
        this.input = input;
    }

    public boolean startWithInclude() {
        return input.startsWith("[");
    }

    public int getStart() {
        int value = parseInt(
                String.valueOf(input.charAt(1)));
        if(startWithInclude()) {
            return value;
        }
        return value + 1;
    }

    public String getResult() {

        // Validate input
        if(input.startsWith("*")) {
//            Checked exception, compile time
//            throw new Exception("Input Error");

//            Unchecked exception , runtime exception
            throw new RuntimeException("Input Error 2");
        }


        int start = getStart();
        int end = 5;
        String result = "";
        for (int i = start; i <= end; i++) {
            result += i + ",";
        }
        return result
                .substring(0, result.length() - 1);
    }



}
