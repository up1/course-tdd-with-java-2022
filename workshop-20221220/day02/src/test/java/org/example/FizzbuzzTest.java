package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

    @Test
    public void casex(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertEquals("AHA", fizzbuzz.call(7));
    }

    @Test
    public void case01(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertEquals("1", fizzbuzz.call(1));
    }

    @Test
    public void case02(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertEquals("2", fizzbuzz.call(2));
        assertEquals("4", fizzbuzz.call(4));
    }

    @Test
    public void case03(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertEquals("Fizz", fizzbuzz.call(3));
        assertEquals("Fizz", fizzbuzz.call(6));
        assertEquals("Fizz", fizzbuzz.call(9));
    }

    @Test
    public void case04(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertEquals("Buzz", fizzbuzz.call(5));
        assertEquals("Buzz", fizzbuzz.call(10));
    }

    @Test
    public void case05(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertEquals("FizzBuzz", fizzbuzz.call(15));
        assertEquals("FizzBuzz", fizzbuzz.call(30));
    }
}