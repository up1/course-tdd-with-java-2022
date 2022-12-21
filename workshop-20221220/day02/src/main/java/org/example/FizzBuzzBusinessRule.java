package org.example;

public class FizzBuzzBusinessRule implements BusinessRule {
    public boolean check(int input) {
        return input % 15 == 0;
    }

    public String say() {
        return "FizzBuzz";
    }
}
