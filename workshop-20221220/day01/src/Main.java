public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.sayHello());
    }

    public String sayHello() {
        newFeature();
        return "Hello world!";
    }

    public void newFeature(){
        System.out.println("");
    }
}