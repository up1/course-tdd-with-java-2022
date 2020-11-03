public class MyRange {

    public static final int ASCII_ZERO = 48;

    private String input;

    public MyRange(){}

    public MyRange(String input) {
        this.input = input;
    }

    public boolean startWithInclude() {
        return input.startsWith("[");
    }

    public boolean endWithInclude() {
        return input.endsWith("]");
    }

    public int getStart() {
        int start = input.charAt(1) - ASCII_ZERO;
        if(startWithInclude()) {
            return start;
        }
        return start + 1;
    }

    public String getResult() {
        int start = getStart();
        int end = 5;
//        String result = start + "";
//        String result = String.valueOf(start);
        String result = String.format("%s", start);
        for (int i = start+1; i <= end; i++) {
            result = String.join(",", result, String.valueOf(i));
        }
        return result;
    }
}
