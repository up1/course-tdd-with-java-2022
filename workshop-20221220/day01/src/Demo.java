public class Demo {
    public static void main(String[] args) {
        A.doSth();
    }
}

class A {
    static void doSth() {
        B.call();
    }
}

 class B {

     public static void call() {
         C.call();
     }
 }

 class C {

     public static void call() {
     }
 }
