public class Hello {
    public String say(String demo) {
        if(demo == null) {
            throw new SomeException();
        }
        return "Hello " + demo;
    }

}
