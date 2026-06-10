import java.util.ArrayList;

final class FinalClass {

    public void display() {
        System.out.println("This is a final class.");
    }
}

// class FinalFinal extends FinalClass {
// }

class A {
    public void run() {
        System.out.println("Running in A");
    }
}

class B extends A {
    public final int a = 10;

    public void run() {
        System.out.println("Running in B");
    }

    public void anotherRun() {
        System.out.println("Another run in B");
    }
}

class C extends B {
    public void run() {
        System.out.println("Running in C");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        int num = 10;

        Integer num1 = num;

        int num2 = num1;

        System.out.println(num2);
        B a = new C();
        a.run();
        a.anotherRun();

        a = new B();
        a.run();
        a.anotherRun();

        a = new C();
        a.run();
        a.anotherRun();

        FinalClass finalClass = new FinalClass();
        System.out.println(finalClass.hashCode());

    }
}