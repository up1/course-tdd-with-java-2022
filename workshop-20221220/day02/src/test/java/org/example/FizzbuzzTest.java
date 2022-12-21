package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {
    @Test
    public void case01(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertEquals("1", fizzbuzz.call(1));
    }

    @Test
    public void case02(){
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        assertEquals("2", fizzbuzz.call(2));
    }
}