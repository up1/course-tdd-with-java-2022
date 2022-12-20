public class Workshop1 {
    private final String input;

    public Workshop1(String input) {
        this.input = input;
    }

    public boolean startWithInclude() {
        return input.startsWith("[");
    }

    public int getStart() {
        return 0;
    }
}
