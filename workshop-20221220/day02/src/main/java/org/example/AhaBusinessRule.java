package org.example;

public class AhaBusinessRule implements BusinessRule {
    public boolean check(int input) {
        return input % 7 == 0;
    }

    public String say() {
        return "AHA";
    }
}
