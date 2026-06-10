
abstract class Abas {
    String name;

    public void outName() {
        System.out.println(name);
    }

    public abstract void stop();

}

interface Car {

    // void start();

    void stop();

}

class Abacus implements Car {
    public String name;

    @Override
    public void stop() {
        System.out.println("stop");
    }
}

public class Abs {

    public static void main(String[] args) {
        // Abacus abacus = new Abacus();
        // abacus.name = "Abacus";
        // abacus.stop();

        // A a = new A();
        // a.run();

        // A.B b = a.new B();
        // b.runB();

        // An an = new An() {
        // void point() {
        // System.out.println("This is the point in anonomous class");
        // }

        // void anotherPoint() {
        // System.out.println("This is the point is another anonomous class");
        // }
        // };

        // an.point();

        Abas abs = new Abas() {
            public void stop() {
                System.out.println("...... abstract with anonomou class ");
            }
        };

        abs.stop();
    }

}

class A {
    void run() {
        System.out.println("Inside the A class ");
    }

    class B {
        void runB() {
            System.out.println("Inside the B class");
        }
    }
}

// Anonoymous class

class An {
    void point(A a) {
        System.out.println("This is point in An");
    }
}
