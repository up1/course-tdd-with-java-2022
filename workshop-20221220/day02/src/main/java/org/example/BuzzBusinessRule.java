package org.example;

public class BuzzBusinessRule implements BusinessRule {
    @Override
    public boolean check(int input) {
        return input % 5 == 0;
    }

    @Override
    public String say() {
        return "Buzz";
    }
}
