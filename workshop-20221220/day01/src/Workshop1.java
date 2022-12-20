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
        return parseInt(String.valueOf(
                input.charAt(1)));
    }
}
