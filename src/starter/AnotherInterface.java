package starter;

import java.util.List;

public interface AnotherInterface {
    // void makeCallAgain();

    // void makeAnotherCallAgain();

    // static void statMethAgain() {
    // System.out.println("This is the Meth method");
    // }

    default void defaultCall(List<Poly> poly) {
        System.out.println("This is the default system method for interfaces");
    }
}
