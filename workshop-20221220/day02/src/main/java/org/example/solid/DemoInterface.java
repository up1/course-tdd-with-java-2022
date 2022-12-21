package org.example.solid;

public class DemoInterface {
    public static void main(String[] args) {
        Report1 report1 = new Report1();
        report1.process();
    }
}

class Report1 extends ReportTypeA {

    @Override
    void generateHeader() {

    }

    @Override
    void generateBody() {

    }

    @Override
    void generateFooter() {

    }
}

abstract class ReportTypeA {
    abstract void generateHeader();
    abstract void generateBody();
    abstract void generateFooter();

    void process(){
        generateHeader();
        generateBody();
        generateFooter();
    }

}

abstract class ReportTypeB {
    abstract void generateHeader();
    abstract void generateBody();

    void process(){
        generateHeader();
        generateBody();
    }

}

abstract class Flow01 {
    void m1() {}
    abstract void m2();
}

interface IData {
    void m1();
    void m2();
}
