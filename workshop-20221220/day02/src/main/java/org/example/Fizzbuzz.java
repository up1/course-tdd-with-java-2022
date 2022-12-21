package org.example;

public class Fizzbuzz {
    public String call(int input) {

        BusinessRule[] rules = new BusinessRule[]{
                new FizzBuzzBusinessRule(),
                new FizzBusinessRule(),
                new BuzzBusinessRule(),
                new AhaBusinessRule()
        };

        for (BusinessRule rule : rules) {
            if (rule.check(input)) {
                return rule.say();
            }
        }

        return String.valueOf(input);
    }
}
