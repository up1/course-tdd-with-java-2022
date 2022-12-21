package org.example.solid;

public class DemoISP {
}

interface A {
    void m1();
    void m2();
}

interface A2 {
    void m3();
}

class V2 implements A, A2 {

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }
}


class V1 implements A {
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}


